import os
import subprocess
import hashlib
import json
from pathlib import Path

# 📂 Pasta que será monitorada
BASE_DIR = Path(r"C:\Users\Fred\Documents\estudos-diarios")
# 📄 Arquivo que vai guardar o histórico de hashes
STATE_FILE = BASE_DIR / ".commit_state.json"

def load_state():
    if STATE_FILE.exists():
        with open(STATE_FILE, "r") as f:
            return json.load(f)
    return {}

def save_state(state):
    with open(STATE_FILE, "w") as f:
        json.dump(state, f, indent=4)

def hash_item(path):
    """Cria um hash para um arquivo ou pasta inteira"""
    if path.is_file():
        hasher = hashlib.sha256()
        with open(path, "rb") as f:
            hasher.update(f.read())
        return hasher.hexdigest()
    elif path.is_dir():
        hasher = hashlib.sha256()
        for root, _, files in os.walk(path):
            for file in sorted(files):
                file_path = Path(root) / file
                with open(file_path, "rb") as f:
                    hasher.update(f.read())
        return hasher.hexdigest()
    return None

def git_commit(path, message):
    # 🔄 Puxa mudanças do GitHub antes de enviar
    subprocess.run(["git", "pull", "origin", "main", "--rebase"], cwd=BASE_DIR)

    # ➕ Adiciona e commita
    subprocess.run(["git", "add", str(path)], cwd=BASE_DIR)
    subprocess.run(["git", "commit", "-m", message], cwd=BASE_DIR)

    # 🚀 Envia pro GitHub
    subprocess.run(["git", "push", "origin", "main"], cwd=BASE_DIR)

def main():
    state = load_state()

    for item in BASE_DIR.iterdir():
        if item.name.startswith(".") or item == STATE_FILE:
            continue  # ignora arquivos ocultos e o arquivo de controle

        item_hash = hash_item(item)
        if not item_hash:
            continue

        if item.name not in state:
            # Novo item → commit inicial
            git_commit(item, f"Adiciona {item.name}")
            state[item.name] = item_hash
        elif state[item.name] != item_hash:
            # Alteração detectada → novo commit
            git_commit(item, f"Atualiza {item.name}")
            state[item.name] = item_hash
        else:
            print(f"Nada mudou em {item.name}")

    save_state(state)

if __name__ == "__main__":
    main()

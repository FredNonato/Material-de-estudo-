import os
import subprocess
from datetime import datetime

# Caminho do seu projeto
repo_path = r"C:\Users\Fred\Documents\estudos-diarios"
os.chdir(repo_path)

# Mensagem de commit com data e hora
commit_message = f"Atualização automática - {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}"

# Comandos Git
subprocess.run(["git", "add", "."], check=True)
subprocess.run(["git", "commit", "-m", commit_message], check=True)
subprocess.run(["git", "push", "origin", "main"], check=True)

print("✅ Atualização enviada para o GitHub com sucesso!")
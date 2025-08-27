import os
import datetime
import subprocess

# Caminho para a pasta do projeto
caminho_projeto = "C:/Users/Fred/Documents/estudos-diarios"
os.chdir(caminho_projeto)

# Data de hoje
hoje = datetime.date.today().isoformat()

# Mensagem de commit
mensagem = f"Estudo diário - {hoje}"

# Comandos Git
subprocess.run(["git", "add", "."])
subprocess.run(["git", "commit", "-m", mensagem])
subprocess.run(["git", "push", "origin", "master"])  # ou "main" se for sua branch principal

print(f"✅ Commit enviado com sucesso: {mensagem}")
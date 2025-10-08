import sqlite3
import os

# Caminho absoluto do banco
caminho_banco = os.path.join(os.path.dirname(__file__), "meu_banco.db")

# Cria conexão e tabelas
conn = sqlite3.connect(caminho_banco)
cursor = conn.cursor()

cursor.execute('''
    CREATE TABLE IF NOT EXISTS clientes (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nome TEXT NOT NULL,
        email TEXT
    )
''')

cursor.execute('''
    CREATE TABLE IF NOT EXISTS produtos (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        produto TEXT NOT NULL,
        preco REAL,
        categoria TEXT,
        quantidade INTEGER,
        codigo_barras TEXT,
        peso REAL
    )
''')

conn.commit()
conn.close()
print("Banco criado com sucesso!")
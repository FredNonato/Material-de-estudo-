import sqlite3

# Cria ou conecta ao banco de dados
import sqlite3
import os

def conectar():
    # Garante que o caminho seja absoluto e dentro da pasta do projeto
    pasta_atual = os.path.dirname(os.path.abspath(__file__))
    caminho_banco = os.path.join(pasta_atual, "meu_banco.db")
    return sqlite3.connect(caminho_banco)

# Cria a tabela se não existir
def criar_tabela():
    conn = conectar()
    cursor = conn.cursor()

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

    cursor.execute('''
        CREATE TABLE IF NOT EXISTS clientes (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            nome TEXT NOT NULL,
            email TEXT
        )
    ''')

    conn.commit()
    conn.close()
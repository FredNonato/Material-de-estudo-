from meu_banco import conectar

def criar_cliente(nome, email):
    conexao = conectar()
    cursor = conexao.cursor()
    cursor.execute("INSERT INTO clientes (nome, email) VALUES (?, ?)", (nome, email))
    conexao.commit()
    conexao.close()

def listar_clientes():
    conexao = conectar()
    cursor = conexao.cursor()
    cursor.execute("SELECT * FROM clientes")
    clientes = cursor.fetchall()
    conexao.close()
    return clientes

def atualizar_cliente(id_cliente, novo_nome, novo_email):
    conexao = conectar()
    cursor = conexao.cursor()
    cursor.execute("UPDATE clientes SET nome=?, email=? WHERE id=?", (novo_nome, novo_email, id_cliente))
    conexao.commit()
    conexao.close()

def deletar_cliente(id_cliente):
    conexao = conectar()
    cursor = conexao.cursor()
    cursor.execute("DELETE FROM clientes WHERE id=?", (id_cliente,))
    conexao.commit()
    conexao.close()

def criar_produto(produto, preco, categoria, quantidade, codigo_barras, peso):
    conexao = conectar()
    cursor = conexao.cursor()
    cursor.execute("INSERT INTO produtos (produto, preco, categoria, quantidade, codigo_barras, peso) VALUES (?, ?, ?, ?, ?, ?)", 
                   (produto, preco, categoria, quantidade, codigo_barras, peso))
    conexao.commit()
    conexao.close()

def listar_produtos():
    conexao = conectar()
    cursor = conexao.cursor()
    cursor.execute("SELECT * FROM produtos")
    produtos = cursor.fetchall()
    conexao.close()
    return produtos

def atualizar_produto(id_produto, novo_produto, novo_preco, nova_categoria, nova_quantidade, novo_codigo_barras, novo_peso):
    conexao = conectar()
    cursor = conexao.cursor()
    cursor.execute("UPDATE produtos SET produto=?, preco=?, categoria=?, quantidade=?, codigo_barras=?, peso=? WHERE id=?", 
                   (novo_produto, novo_preco, nova_categoria, nova_quantidade, novo_codigo_barras, novo_peso, id_produto))
    conexao.commit()
    conexao.close()

def deletar_produto(id_produto):
    conexao = conectar()
    cursor = conexao.cursor()
    cursor.execute("DELETE FROM produtos WHERE id=?", (id_produto,))
    conexao.commit()
    conexao.close()



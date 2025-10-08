from meu_banco import criar_tabela
import crud

def main():
    criar_tabela()

def menu_inicial():
    print("=== Menu Inicial ===")
    print("1 - Gerenciar Clientes")
    print("2 - Gerenciar Produtos")

def painel_clientes():
    print("=== Painel de Clientes ===")
    painel_clientes = [
        "1 - Cadastrar Cliente",
        "2 - Listar Clientes",
        "3 - Atualizar Cliente",
        "4 - Deletar Cliente",
        "0 - Voltar"
    ]
    a2 = print("\n".join(painel_clientes))

def painel_produtos():
    print("=== Painel de Produtos ===")
    painel_produtos = [
        "1 - Cadastrar Produto",
        "2 - Listar Produtos",
        "3 - Atualizar Produto",
        "4 - Deletar Produto",
        "0 - Voltar"
    ]
    a1 = print("\n".join(painel_produtos))

def main():
    while True:
        menu_inicial()
        escolha = input("Escolha uma opção: ")
        if escolha == "1":
            while True:
                painel_clientes()
                escolha_clientes = input("Escolha uma opção: ")
                if escolha_clientes == "1":
                    nome = input("Nome: ")
                    email = input("Email: ")
                    crud.criar_cliente(nome, email)
                elif escolha_clientes == "2":
                    clientes = crud.listar_clientes()
                    for cliente in clientes:
                        print(cliente)
                elif escolha_clientes == "3":
                    id_cliente = int(input("ID do Cliente a ser atualizado: "))
                    novo_nome = input("Novo Nome: ")
                    novo_email = input("Novo Email: ")
                    crud.atualizar_cliente(id_cliente, novo_nome, novo_email)
                elif escolha_clientes == "4":
                    id_cliente = int(input("ID do Cliente a ser deletado: "))
                    crud.deletar_cliente(id_cliente)
                elif escolha_clientes == "0":
                    break
                else:
                    print("Opção inválida.")
        elif escolha == "2":
            while True:
                painel_produtos()
                escolha_produtos = input("Escolha uma opção: ")
                if escolha_produtos == "1":
                    produto = input("Produto: ")
                    preco = float(input("Preço: "))
                    categoria = input("Categoria: ")
                    quantidade = int(input("Quantidade: "))
                    codigo_barras = input("Código de Barras: ")
                    peso = float(input("Peso: "))
                    crud.criar_produto(produto, preco, categoria, quantidade, codigo_barras, peso)
                elif escolha_produtos == "2":
                    produtos = crud.listar_produtos()
                    for produto in produtos:
                        print(produto)
                elif escolha_produtos == "3":
                    id_produto = int(input("ID do Produto a ser atualizado: "))
                    novo_produto = input("Novo Produto: ")
                    novo_preco = float(input("Novo Preço: "))
                    nova_categoria = input("Nova Categoria: ")
                    nova_quantidade = int(input("Nova Quantidade: "))
                    novo_codigo_barras = input("Novo Código de Barras: ")
                    novo_peso = float(input("Novo Peso: "))
                    crud.atualizar_produto(id_produto, novo_produto, novo_preco, nova_categoria, nova_quantidade, novo_codigo_barras, novo_peso)
                elif escolha_produtos == "4":
                    id_produto = int(input("ID do Produto a ser deletado: "))
                    crud.deletar_produto(id_produto)
                elif escolha_produtos == "0":
                    break
                else:
                    print("Opção inválida.")
        else:
            print("Opção inválida.")        

if __name__ == "__main__":
    main()

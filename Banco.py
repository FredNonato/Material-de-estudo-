import random 

class Banco:
    def __init__(self, nome):
        self.nome = nome
        self.clientes = []

    def listar_clientes(self):
        for cliente in self.clientes:
            print(f"Cliente: {cliente.nome}, Saldo: {cliente.saldo}")

class Cliente:
    def __init__(self, nome, cpf, email):
        self.nome = nome
        self.cpf = cpf
        self.email = email
        
class Cadastro:
    def __init__(self):
        self.nome = input("Digite seu nome: ")
        self.cpf = input("Digite seu CPF: ")
        self.email = input("Digite seu email: ")

class Conta:
    def __init__(self, Cliente):
        self.saldo = 0
        self.numero_conta = random.randint(1000, 9999)
        try: 
            def criar_senha():
                senha = input("Crie uma senha numérica de 4 dígitos: ")
                if len(senha) == 4 and senha.isdigit():
                    return senha
                else:
                    raise ValueError("Senha inválida. Deve conter exatamente 4 dígitos numéricos.")
        except Exception as e:
            print(f"Ocorreu um erro ao criar a senha: {e}")
        self.senha = criar_senha()


class Logger:
    def __init__(self):
        self.logs = []

    def registrar(self, mensagem):
        self.logs.append(mensagem)
        print(f"LOG: {mensagem}")





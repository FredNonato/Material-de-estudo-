class Pessoa:
    
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def apresentar(self):
        print(f"Olá, meu nome é {self.nome} e eu tenho {self.idade} anos.")
    
pessoa1 = Pessoa("Alice", 30)
pessoa2 = Pessoa("Bob", 25)
pessoa1.apresentar()
pessoa2.apresentar()

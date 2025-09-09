class Animal:
    def __init__(self, especie, idade, nome):
        self.especie = especie
        self.idade = idade
        self.nome = nome

    def emitir_som(self, som):
        print(f"O {self.especie} chamado {self.nome} emite o som: {som}")

    def falar(self):
        print(f"O {self.especie} chamado {self.nome} está tentando falar...")

class Cao(Animal):
    def __init__(self, idade, nome):
        super().__init__("Cão", idade, nome)

    def falar(self):
        print(f"{self.nome} (Cão): Olá humanos!")

    def emitir_som(self):
        super().emitir_som("Au Au")

class Gato(Animal):
    def __init__(self, idade, nome):
        super().__init__("Gato", idade, nome)

    def falar(self):
        print(f"{self.nome} (Gato): Meow... humanos!")

    def emitir_som(self):
        super().emitir_som("Miau")

# Função polimórfica
def executar_fala(animal):
    animal.falar()

# Testes
gato1 = Gato(3, "Whiskers")
cao1 = Cao(5, "Rex")

executar_fala(gato1)  # Meow... humanos!
executar_fala(cao1)   # Olá humanos!
    
    


gato1 = Gato(3, "Whiskers")
gato1.emitir_som()
cao1 = Cao(5, "Rex")
cao1.emitir_som()

class Carro:

    def __init__ (self, modelo, ano, cor):
        self.modelo = modelo
        self.ano = ano
        self.cor = cor

    def exibir_info(self):
        print(f"Modelo: {self.modelo}, Ano: {self.ano}, Cor: {self.cor}")

carro1 = Carro("Fusca", 1970, "Azul")
carro1.exibir_info()
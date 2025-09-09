class Forma:

    def area(self):
        pass

class Quadrado(Forma):
    def __init__(self, lado):
        self.lado = lado

    def area(self):
        return self.lado * self.lado
    
class Circulo(Forma):
    def __init__(self, raio):
        self.raio = raio

    def area(self):
        import math
        return math.pi * (self.raio ** 2)

class Triangulo(Forma):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return (self.base * self.altura) / 2
    
# Testes

formas = [Quadrado(4), Circulo(3:.2f), Triangulo(4, 5)]
for forma in formas:
    print(f"Área: {forma.area()}")
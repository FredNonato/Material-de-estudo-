class Calculadora:

    def __init__(self):
        self.resultado = 0
    
    @staticmethod
    def somar(a, b):
        return a + b
    
    @staticmethod
    def subtrair(a, b):
        return a - b
    
    @staticmethod
    def multiplicar(a, b):
        return a * b
    
    @staticmethod
    def dividir(a, b):
        if b != 0:
            return a / b
        else:
            return "Erro: Divisão por zero não é permitida."
        
calc = Calculadora()
print("Soma: ", calc.somar(10, 5))
print("Subtração: ", calc.subtrair(10, 5))
print("Multiplicação: ", calc.multiplicar(10, 5))
print("Divisão: ", calc.dividir(10, 5))

class Funcionario:

    def __init__ (self, nome, salario):
        self.nome = nome
        self.salario = salario

class gerente(Funcionario):
    def __init__(self, departamento):
        super().__init__("Carlos", 5000)
        self.departamento = departamento

    def exibir_info(self):
        print(f"Nome: {self.nome}, Salário: {self.salario}, Departamento: {self.departamento}")

gerente1 = gerente("Vendas")
gerente1.exibir_info()
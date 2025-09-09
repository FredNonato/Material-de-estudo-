class ContaBancaria:

    def __init__ (self, nome, saldo):
        self.nome = nome
        self.saldo = saldo

    def depositar(self, valor):
        self.saldo += valor
        print(f"Depósito de {valor} realizado. Novo saldo: {self.saldo}")

    def sacar(self, valor):
        if valor > self.saldo:
            print("Saldo insuficiente para saque.")
        else:
            self.saldo -= valor
            print(f"Saque de {valor} realizado. Novo saldo: {self.saldo}")

conta1 = ContaBancaria("Alice", 1000)
conta2 = ContaBancaria("Bob", 500)
conta1.depositar(200)
conta2.sacar(100)

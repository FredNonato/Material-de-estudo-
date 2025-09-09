class Produto:

    def __init__(self, nome, preco, quantidade):
        self.nome = nome
        self.preco = preco
        self.quantidade = quantidade

    def valor_total(self):
        return self.preco * self.quantidade
    def exibir_info(self):
        print(f"Produto: {self.nome}, Preço: {self.preco}, Quantidade: {self.quantidade}")
        print(f"Valor Total: {self.valor_total()}")

produto1 = Produto("Caneta", 1.50, 100)
produto2 = Produto("Caderno", 15.00, 50)
produto1.exibir_info()
produto2.exibir_info()
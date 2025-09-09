class Segredo:

    __segredo = "Este é um segredo muito bem guardado!"

    @staticmethod
    def revelar_segredo():
        return Segredo.__segredo
    
# Testando o acesso ao segredo
print(Segredo.__segredo)  # Isso causará um erro de atributo
print(Segredo.revelar_segredo())  # Acesso permitido através do método público
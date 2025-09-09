class Privado:

    __senha = "1234"

    def acessar_senha(self):
        return self.__senha
    
obj = Privado()
print(obj.acessar_senha())
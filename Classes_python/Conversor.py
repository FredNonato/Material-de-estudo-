class Conversor:

    def __init__(self, valor):
        self.valor = valor

    def m_paraa_km(self):
        convertido = self.valor / 1000
        print(f"{self.valor} metros equivalem a {convertido} quilômetros.")

km1 = Conversor(1500)
km1.m_paraa_km()
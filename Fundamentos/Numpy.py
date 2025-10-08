import numpy as np

'''
#np.mean() - calcula a media dos valores 

dados = [127, 90, 201, 150, 210, 220, 115]

media = np.mean(dados)
print(f'Média: {media}')'''

'''
#np.max() - retorna o valor maximo da array
#np.min() - retorna o valor minimo da array
#np.var() - calcula a variancia dos valores

precos = np.array([31.40, 31.25, 30.95, 31.20, 31.60, 31.50])

preco_max = np.max(precos)
preco_min = np.min(precos)
preco_variancia = np.var(precos)
print(f'máximo: {preco_max} mínimo: {preco_min} variância: {preco_variancia:.6f}')'''

'''
np.dot() - realiza a multiplicação de arrays e a soma dessas multiplicações

quantidades = np.array([5, 3, 2])
precos = np.array([100, 200, 50])

total = np.dot(quantidades, precos)
print(f'Total: {total}')'''


'''
#aqui foi desenvolvido um filtro usando o where para retornar valores acima da media a partir de uma array


salarios = np.array([3000, 2500, 3500, 4000, 2000, 4500, 3000, 3800, 4800])

salario_acima_media = salarios[salarios > np.mean(salarios)]
print(salario_acima_media)'''


'''
#np.where() - calcula o desvio padrao a partir da media obtida e trata em dois casos as devolutivas 

tempos_ciclo = np.array([5.5, 5.7, 5.9, 6.0, 5.8, 5.6, 5.7, 7.2, 4.8])
media = np.mean(tempos_ciclo) 
desvio_padrao = np.where(((tempos_ciclo > (media + 2)) & ((tempos_ciclo < (media - 2)))), 'esta acima da media', 'esta abaixo da media')
print(desvio_padrao)'''

'''
#np.sum(,axis=1) - é a função onde cada linha representa um produto e com isso ele retorna o valor total de cada em um array 

vendas = np.array([[50, 60, 70, 65, 80],
                   [85, 90, 78, 92, 88],
                   [72, 75, 68, 77, 76]])
valor_produto = np.sum(vendas, axis=1)
print(f'Valor total por produto: {valor_produto}')'''

'''
#rng - gerador padrão de numeros aleatorios 
#.integers() - limite de quantidade e tamanho que o gerador ira criar de numeros
#np.mean() - calcula a media dos valores

rng = np.random.default_rng(seed=42)
respostas = rng.integers(low=0, high=10, size=210, endpoint=True)
respostas_ordenada = np.reshape(respostas, (-1, 7))
media_geral = np.mean(respostas_ordenada)
print(f'média geral do mês: {media_geral:.2f}')'''





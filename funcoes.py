'''
def stockouts(vendas) - faz o calculo da quantidade de itens final, a partir do padrao de itens em falta no estoque dividido pela soma dos itens vendidos mais
os itens em falta no estoque, retornando o valor em porcentagem.
for venda in vendas - percorre o dicionario de vendas, verificando com o if se a venda foi cancelada por falta de estoque ou se foi concluida, somando as quantidades
respectivamente.



vendas = {'VE0001': (9868,'Concluído',''),'VE0002': (9642,'Concluído',''),'VE0003': (6007,'Concluído',''),'VE0004': (15562,'Concluído',''),'VE0005': (18752,'Cancelado','Estoque em Falta'),'VE0006': (16358,'Cancelado','Estoque em Falta'),'VE0007': (17045,'Concluído',''),'VE0008': (12230,'Concluído',''),'VE0009': (6747,'Concluído',''),'VE0010': (15114,'Concluído',''),'VE0011': (12497,'Concluído',''),'VE0012': (6001,'Concluído',''),'VE0013': (16227,'Cancelado','Cancelada pelo Cliente'),'VE0014': (16150,'Concluído',''),'VE0015': (17705,'Concluído',''),'VE0016': (9978,'Concluído',''),'VE0017': (4266,'Concluído',''),'VE0018': (11531,'Concluído',''),'VE0019': (10352,'Cancelado','Cancelada pelo Cliente'),'VE0020': (16544,'Concluído',''),'VE0021': (15488,'Concluído',''),'VE0022': (15828,'Concluído',''),'VE0023': (1218,'Concluído',''),'VE0024': (11560,'Concluído',''),'VE0025': (14220,'Concluído',''),'VE0026': (17839,'Concluído',''),'VE0027': (4050,'Concluído',''),'VE0028': (7594,'Cancelado','Estoque em Falta'),'VE0029': (19586,'Concluído',''),'VE0030': (8453,'Concluído',''),'VE0031': (3589,'Concluído',''),'VE0032': (13472,'Cancelado','Cancelada pelo Cliente'),'VE0033': (16994,'Concluído',''),'VE0034': (2139,'Concluído',''),'VE0035': (10173,'Concluído',''),'VE0036': (17784,'Cancelado','Estoque em Falta'),'VE0037': (12214,'Concluído',''),'VE0038': (5878,'Concluído',''),'VE0039': (2622,'Concluído',''),'VE0040': (9765,'Concluído',''),'VE0041': (8872,'Concluído',''),'VE0042': (16543,'Concluído',''),'VE0043': (8994,'Concluído',''),'VE0044': (4332,'Concluído',''),'VE0045': (19679,'Concluído',''),'VE0046': (14968,'Concluído',''),'VE0047': (6352,'Concluído',''),'VE0048': (11461,'Concluído',''),'VE0049': (5285,'Concluído',''),'VE0050': (11639,'Concluído',''),'VE0051': (6023,'Concluído',''),'VE0052': (4943,'Concluído',''),'VE0053': (5654,'Concluído',''),'VE0054': (11734,'Concluído',''),'VE0055': (2742,'Concluído',''),'VE0056': (5380,'Cancelado','Estoque em Falta'),'VE0057': (5578,'Concluído',''),'VE0058': (1897,'Concluído',''),'VE0059': (7857,'Concluído',''),'VE0060': (4472,'Concluído',''),'VE0061': (19874,'Concluído',''),'VE0062': (13323,'Cancelado','Cancelada pelo Cliente'),'VE0063': (5821,'Concluído',''),'VE0064': (4410,'Concluído',''),'VE0065': (16676,'Concluído',''),'VE0066': (10577,'Concluído',''),'VE0067': (10627,'Concluído',''),'VE0068': (1987,'Concluído',''),'VE0069': (13197,'Concluído',''),'VE0070': (15063,'Concluído',''),'VE0071': (14363,'Concluído',''),'VE0072': (10452,'Concluído',''),'VE0073': (15376,'Concluído',''),'VE0074': (4661,'Concluído',''),'VE0075': (13287,'Concluído',''),'VE0076': (8278,'Concluído',''),'VE0077': (7134,'Concluído',''),'VE0078': (16568,'Concluído',''),'VE0079': (17732,'Concluído',''),'VE0080': (5127,'Concluído',''),'VE0081': (4582,'Concluído',''),'VE0082': (14804,'Cancelado','Cancelada pelo Cliente'),'VE0083': (12362,'Concluído',''),'VE0084': (1148,'Concluído',''),'VE0085': (14018,'Concluído',''),'VE0086': (15891,'Concluído',''),'VE0087': (4517,'Concluído',''),'VE0088': (1770,'Concluído',''),'VE0089': (14926,'Concluído',''),'VE0090': (13627,'Concluído',''),'VE0091': (3047,'Concluído',''),'VE0092': (13924,'Concluído',''),'VE0093': (7158,'Concluído',''),'VE0094': (5942,'Concluído',''),'VE0095': (13480,'Concluído',''),'VE0096': (17686,'Concluído',''),'VE0097': (5722,'Cancelado','Cancelada pelo Cliente'),'VE0098': (16963,'Concluído',''),'VE0099': (14225,'Concluído',''),'VE0100': (12553,'Concluído',''),'VE0101': (18047,'Concluído',''),'VE0102': (11420,'Concluído',''),'VE0103': (6191,'Concluído',''),'VE0104': (8388,'Concluído',''),'VE0105': (17210,'Concluído',''),'VE0106': (12217,'Concluído',''),'VE0107': (8984,'Concluído',''),'VE0108': (7638,'Cancelado','Cancelada pelo Cliente'),'VE0109': (8462,'Concluído',''),'VE0110': (14081,'Concluído',''),'VE0111': (10842,'Concluído',''),'VE0112': (13261,'Concluído',''),'VE0113': (16953,'Cancelado','Estoque em Falta'),'VE0114': (5343,'Concluído',''),'VE0115': (4734,'Concluído',''),'VE0116': (13606,'Cancelado','Cancelada pelo Cliente'),'VE0117': (17106,'Cancelado','Estoque em Falta'),'VE0118': (17704,'Concluído',''),'VE0119': (12242,'Concluído',''),'VE0120': (7476,'Cancelado','Estoque em Falta'),'VE0121': (18408,'Concluído',''),'VE0122': (13612,'Concluído',''),'VE0123': (18198,'Concluído',''),'VE0124': (4844,'Concluído',''),'VE0125': (12750,'Concluído',''),'VE0126': (11969,'Concluído',''),'VE0127': (15337,'Concluído',''),'VE0128': (1100,'Concluído',''),'VE0129': (18893,'Concluído',''),'VE0130': (15850,'Concluído',''),'VE0131': (2097,'Concluído',''),'VE0132': (11636,'Cancelado','Estoque em Falta'),'VE0133': (12603,'Concluído',''),'VE0134': (10769,'Concluído',''),'VE0135': (11016,'Concluído',''),'VE0136': (14556,'Concluído',''),'VE0137': (1389,'Concluído',''),'VE0138': (11681,'Concluído',''),'VE0139': (16759,'Cancelado','Cancelada pelo Cliente'),'VE0140': (16317,'Concluído',''),'VE0141': (5965,'Concluído',''),'VE0142': (4493,'Concluído',''),'VE0143': (5398,'Concluído',''),'VE0144': (9875,'Concluído',''),'VE0145': (17492,'Concluído',''),'VE0146': (7473,'Concluído',''),'VE0147': (10284,'Concluído',''),'VE0148': (10778,'Concluído',''),'VE0149': (2227,'Concluído',''),'VE0150': (14157,'Concluído',''),'VE0151': (9516,'Concluído',''),'VE0152': (9824,'Concluído',''),'VE0153': (5118,'Concluído',''),'VE0154': (5123,'Concluído',''),'VE0155': (2697,'Concluído',''),'VE0156': (19024,'Concluído',''),'VE0157': (5128,'Concluído',''),'VE0158': (8293,'Cancelado','Estoque em Falta'),'VE0159': (18782,'Concluído',''),'VE0160': (12182,'Concluído',''),'VE0161': (9063,'Concluído',''),'VE0162': (17608,'Concluído',''),'VE0163': (8456,'Cancelado','Cancelada pelo Cliente'),'VE0164': (1291,'Concluído',''),'VE0165': (14018,'Concluído',''),'VE0166': (2791,'Concluído',''),'VE0167': (17953,'Concluído',''),'VE0168': (14627,'Concluído',''),'VE0169': (3296,'Concluído',''),'VE0170': (1863,'Concluído',''),'VE0171': (4719,'Concluído',''),'VE0172': (15060,'Concluído',''),'VE0173': (2596,'Cancelado','Cancelada pelo Cliente'),'VE0174': (4919,'Concluído',''),'VE0175': (13770,'Concluído',''),'VE0176': (15041,'Cancelado','Estoque em Falta'),'VE0177': (6702,'Concluído',''),'VE0178': (9989,'Concluído',''),'VE0179': (5135,'Concluído',''),'VE0180': (13337,'Concluído',''),'VE0181': (13457,'Concluído',''),'VE0182': (17218,'Concluído',''),'VE0183': (6424,'Concluído',''),'VE0184': (5478,'Concluído',''),'VE0185': (10478,'Cancelado','Cancelada pelo Cliente'),'VE0186': (3240,'Concluído',''),'VE0187': (16503,'Concluído',''),'VE0188': (12762,'Concluído',''),'VE0189': (6985,'Cancelado','Cancelada pelo Cliente'),'VE0190': (13013,'Concluído',''),'VE0191': (5706,'Concluído',''),'VE0192': (6521,'Cancelado','Estoque em Falta'),'VE0193': (12904,'Concluído',''),'VE0194': (14691,'Concluído',''),'VE0195': (19338,'Concluído',''),'VE0196': (4556,'Cancelado','Cancelada pelo Cliente'),'VE0197': (9653,'Concluído',''),'VE0198': (4617,'Concluído',''),'VE0199': (4717,'Concluído',''),'VE0200': (8366,'Concluído','')}
def stockouts(vendas):
    vendas_perdidas_estoque = 0
    vendas_concluidas = 0
    for venda in vendas:
        if vendas[venda][2] == 'Estoque em Falta':
            vendas_perdidas_estoque += 1
        elif vendas[venda][1] == 'Concluído':
            vendas_concluidas += 1
    stockout = vendas_perdidas_estoque / (vendas_perdidas_estoque + vendas_concluidas) / 100
    return stockout

stockoutF = stockouts(vendas)
print(f'Stockout: {stockoutF:.2%}')'''





'''
def quantidade_total(*args) - função que recebe um numero indeterminado de listas, onde cada lista contem tuplas com nome e quantidade do produto, retornando 
uma lista com os produtos distintos e a soma total deles.
for lista in args - percorre cada lista passada como argumento.
for produto, quantidade in lista - percorre cada tupla retirando o nome e a quantidade distinta do produto.



estoque_fim_jan = [('BSA2199',396),('PPF5239',251),('BSA1212',989),('PPF2154',449),('BEB3410',241),('PPF8999',527),('EMB9591',601),('BSA2006',314),('EMB3604',469),('EMB2070',733),('PPF9018',339),('PPF1468',906),('BSA5819',291),('PPF8666',850),('BEB2983',353),('BEB5877',456),('PPF5008',963),('PPF3877',185),('PPF7321',163),('BSA8833',644),('PPF4980',421),('PPF3063',757),('BSA2089',271),('BSA8398',180),('EMB4622',515),('EMB9814',563),('PPF3784',229),('PPF2398',270),('BEB3211',181),('PPF8655',459),('PPF1874',799),('PPF8789',126),('PPF6324',375),('EMB9290',883),('BSA5516',555),('BSA8451',243),('BSA8213',423)]
estoque_fim_fev = [('BSA2199',849),('PPF5239',877),('BSA1212',336),('PPF2154',714),('BEB3410',834),('PPF8999',201),('EMB9591',576),('BSA2006',985),('EMB3604',615),('EMB2070',182),('PPF9018',127),('PPF1468',212),('BSA5819',338),('PPF8666',751),('BEB2983',363),('BEB5877',916),('PPF5008',331),('PPF3877',744),('PPF7321',488),('BSA8833',277),('PPF4980',530),('PPF3063',796),('BSA2089',396),('BSA8398',478),('EMB4622',603),('EMB9814',784),('PPF3784',434),('PPF2398',896),('BEB3211',826),('PPF8655',748),('PPF1874',210),('PPF8789',891),('PPF6324',250),('EMB6618',611),('BSA3409',984),('BSA9866',870),('BSA1792',672)]
estoque_fim_mar = [('BSA2199',772),('PPF5239',394),('BSA1212',409),('PPF2154',473),('BEB3410',831),('PPF8999',764),('EMB9591',942),('BSA2006',482),('EMB3604',745),('EMB2070',451),('PPF9018',608),('PPF1468',675),('BSA5819',431),('PPF8666',795),('BEB2983',439),('BEB5877',588),('PPF5008',442),('PPF3877',950),('PPF7321',606),('BSA8833',464),('PPF4980',819),('PPF3063',687),('BSA2089',253),('BSA8398',437),('EMB4622',769),('EMB9814',178),('PPF3784',996),('PPF2398',588),('BEB3211',247),('PPF8655',309),('PPF1874',305),('PPF8789',878),('PPF6324',826),('EMB6618',534),('BSA3409',705),('BSA9895',618),('BSA4319',690)]
estoque_fim_abr = [('BSA2199',647),('PPF5239',292),('BSA1212',551),('PPF2154',802),('BEB3410',712),('PPF8999',603),('EMB9591',963),('BSA2006',481),('EMB3604',199),('EMB2070',635),('PPF9018',956),('PPF1468',161),('BSA5819',787),('PPF8666',771),('BEB2983',867),('BEB5877',539),('PPF5008',614),('PPF3877',715),('PPF7321',336),('BSA8833',961),('PPF4980',116),('PPF3063',876),('BSA2089',579),('BSA8398',814),('EMB4622',434),('EMB9814',981),('PPF3784',498),('PPF2398',498),('BEB3211',606),('PPF8655',168),('PPF1874',518),('PPF8789',157),('PPF6324',501),('EMB6618',932),('BSA3409',247),('BSA9895',287),('BSA4319',477)]

def quantidade_total(*args):
    lista_produtos = []
    total = 0 
    for lista in args:
        for produto, quantidade in lista:
            if produto not in lista_produtos:
                lista_produtos.append(produto)
            total += quantidade
    return lista_produtos, total

produtos, qtde_total = quantidade_total(estoque_fim_jan, estoque_fim_fev, estoque_fim_mar, estoque_fim_abr)

print(f'Os produtos em estoque são {produtos} com a quantidade total em estoque nos quatro meses: {qtde_total}')'''


'''
def quantidade_tinta() - função que calcula a quantidade de tinta necessária e a partir dela o custo total, baseado na escolha do galão de tinta

if, elif, else - tratativa para as tres possiblidades de galao e opcao invalida, com retorno em cada referente a quantidade de litros necessarios e seu custo
if dentro do elif - decisão de qual das duas combinações sera de melhor custo beneficio



def quantidade_tinta(metros_quadrados, galao_usado):
    litros_necessarios = 1/6 * metros_quadrados
    if galao_usado == 18:
        preco_18l = (litros_necessarios // 18) * 80
        return litros_necessarios, preco_18l
    elif galao_usado == 3.6:
        preco_3_6l = (litros_necessarios // 3.6) * 25
        return litros_necessarios, preco_3_6l
    elif galao_usado == 'misto':
        preco_18l = (litros_necessarios // 18) * 80
        litros_restantes = litros_necessarios % 18
        preco_3_6l = (litros_restantes // 3.6) * 25
        preco_total = preco_18l + preco_3_6l
        preco_3_6 = (litros_necessarios // 3.6) * 25
        litros_restantes1 = litros_necessarios % 3.6
        preco_18 = (litros_restantes1 // 18) * 80
        preco_total1 = preco_3_6 + preco_18
        if preco_total < preco_total1:
            return litros_necessarios, preco_total
        else:
            return litros_necessarios, preco_total1
    else:
        return 'Opção inválida, escolha 18, 3.6 ou misto'

cotacao1 = quantidade_tinta(100, 18)
cotacao2 = quantidade_tinta(100, 3.6)
cotacao3 = quantidade_tinta(100, 'misto')
print(f'Para pintar 100 metros quadrados, serão necessários {cotacao1[0]} litros de tinta, no galão de 18 litros o custo será de R$ {cotacao1}, no galão de 3,6 o custo será de R$ {cotacao2} e usando a compra mista o custo será de R$ {cotacao3}')
''' 
            
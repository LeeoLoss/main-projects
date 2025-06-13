# Especificamos os dados para um dicionário
dados = {'Área Norte': [2819, 7236],
         'Área Leste': [1440, 9492],
         'Área Sul': [5969, 7496],
         'Área Oeste': [14446, 49688],
         'Área Centro': [22558, 45148]}
# Inicializamos as variáveis
soma_media = 0 # Irá somar todas as médias
maior_diversidade = '' # Irá armazenar a área com maior diversidade
maior_soma = 0 # Irá armazenar a maior soma de espécies 
# Percorremos os valores de chaves e elementos do dicionário
for area, especies in dados.items():
  # Fazemos a soma do números de espécies em cada área com a função sum
  soma_especies = sum(especies)
  # Calculamos a média dividindo a soma das espécies pela quantidade de espécies
  media = soma_especies / len(especies)
  # Imprimimos
  print(f'A {area} tem a média de {media} espécies')
  # Verificamos se a soma das espécies é maior que o valor armazenado de maior_soma
  # Cada vez que a soma_especies superar o valor de maior_soma, 
  # a variável maior_soma vai ser igual à soma_especies, atribuindo um novo valor
  # De forma similar, maior_diversidade também é substituída
  if soma_especies > maior_soma:
      maior_soma = soma_especies
      maior_diversidade = area
  # Somamos as médias
  soma_media += media
# A média total será dada pela soma_media dividida pela quantidade de áreas
media_total = soma_media / len(dados)
print(f'Média geral de espécies: {media_total}')
print(f'Área com a maior diversidade biológica: {maior_diversidade}')

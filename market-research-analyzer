# Dicionário de votos por design
votos = {'Design 1': 1334, 'Design 2': 982, 'Design 3': 1751, 'Design 4': 210, 'Design 5': 1811}

# Inicializamos as variáveis
total_votos = 0 # Irá somar todos os votos 
vencedor = '' # Irá armazenar o nome do design vencedor
voto_vencedor = 0 # Irá armazenar a quantidade vencedora de votos

# Percorremos os valores de chaves e elementos do dicionário
for design, voto_desing in votos.items():
  # Somamos o total de votos
  total_votos += voto_desing
  # Verificamos se o voto do atual desing (voto_desing) é maior que o valor armazenado em voto_vencedor
  # Cada vez que voto_desing superar o valor em voto_vencedor, 
  # a variável voto_vencedor vai ser igual à voto_desing, atribuindo um novo valor
  # De forma similar, o vencedor também é substituído pelo design
  if voto_desing > voto_vencedor:
    voto_vencedor = voto_desing
    vencedor = design
# Calculamos a porcentagem do design vencedor
porcentagem = 100 * (voto_vencedor) / (total_votos)

#Resultado
print(f'{vencedor} é o vencedor: ')
print(f'Porcentagem de votos: {porcentagem}%')

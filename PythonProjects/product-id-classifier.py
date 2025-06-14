# Lista que vai receber os valores de IDs
ids = []
# Variáveis contadoras de doces e amargos
doce = 0
amargo = 0

# Criamos um laço que vai iterar 10 vezes para receber os 10 IDs
for i in range(0,10):
  # Coletamos o ID e adicionamos o id na lista
  ids.append(int(input(f'Digite o {i+1}° ID: ')))

# Ler todos os elementos da lista ids e atribuir à id
for id in ids:
  # Verificamos se os elementos são pares ou ímpares para fazer a contagem
  if id % 2 == 0:
    doce += 1
  else:
    amargo += 1

# Resultado
print(f'Quantidade de produtos doces: {doce}')
print(f'Quantidade de produtos amargos: {amargo}')

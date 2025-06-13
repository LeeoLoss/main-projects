# Coletamos a lista de temperaturas
temperaturas_mensais = []
for i in range(0,12):
  temperaturas_mensais.append(float(input(f'Digite a média de temperatura do mês {i+1}: ')))
# Criamos uma lista auxiliar para os nomes dos meses
meses = ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro']
# Calculamos a média
media_anual = sum(temperaturas_mensais) / len(temperaturas_mensais)

#Resultado
print('Temperaturas acima da média em: ')
for i in range(0,12):
  # Verificamos todas as temperaturas de acordo com a média anual
  if temperaturas_mensais[i] > media_anual:
    # Como os índices dos meses correspondem às temperaturas,
    # podemos imprimir eles sob o mesmo índice
    print(meses[i])

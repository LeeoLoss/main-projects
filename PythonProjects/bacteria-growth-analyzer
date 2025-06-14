# Lista de crescimento das bactérias
bacterias_colonia = [1.2, 2.1, 3.3, 5.0, 7.8, 11.3, 16.6, 25.1, 37.8, 56.9]

# Lista que irá armazenar as porcentagens de crescimento
porcentagem_crescimento = []

# Vamos percorrer os índices de 1 a 9 para compararmos o valor atual com o passado
for i in range(1, len(bacterias_colonia)):
  # seguindo o cálculo 100 * (amostra_atual - amostra_passada) / (amostra_passada)
  porcentagem = 100 * (bacterias_colonia[i] - bacterias_colonia[i-1]) / (bacterias_colonia[i-1])
  # adicionado o resultado na lista porcentagem_crescimento
  porcentagem_crescimento.append(porcentagem)
# Resultado
print(f'Porcentagens de crescimento:\n{porcentagem_crescimento}')

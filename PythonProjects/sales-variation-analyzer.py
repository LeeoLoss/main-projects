# Coletando as vendas dos dois anos
venda_2022 = float(input('Informe a quantidade de vendas em 2022: '))
venda_2023 = float(input('Informe a quantidade de vendas em 2023: '))

# Calculamos a variação percentual entre as vendas dos anos de 2022 e 2023
var_percentual = 100 * (venda_2023 - venda_2022) / (venda_2022)

# Análise condicional da variação percentual para determinar a sugestão a ser enviada
if var_percentual > 20:
    print('Bonificação para o time de vendas.')
elif 2 <= var_percentual <= 20:
    print('Pequena bonificação para time de vendas.')
elif -10 <= var_percentual < 2:
    print('Planejamento de políticas de incentivo às vendas.')
else:
    print('Corte de gastos.')

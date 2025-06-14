## Este é um exemplo de uma calculadora simples que permite ao usuário realizar operações matemáticas básicas.
# O código solicita ao usuário dois números e uma operação, e então executa a operação escolhida.
while True:
    try:
        num1 = float(input('Digite o primeiro número: '))
        num2 = float(input('Digite o segundo número: '))
    except:
        print('Um ou ambos os números são inválidos. Tente novamente.')
        continue

    operacao = input('Digite a operação (adição(+), subtração(-), multiplicação(*), divisão(/)): ')

    operadores_permitidos = ('+', '-', '*', '/')

    if operacao not in operadores_permitidos or len(operacao) != 1:
        print('Operador informado inválido. Digite apenas um operador permitido.')
        continue

    print(f'Realizando aqui a sua operação: {num1} {operacao} {num2}. Confira abaixo o resultado.')

    if operacao == '+':
        resultado = num1 + num2
    elif operacao == '-':
        resultado = num1 - num2
    elif operacao == '*':
        resultado = num1 * num2
    elif operacao == '/':
        if num2 == 0:
            print('Divisão por zero não é permitida.')
            continue
        resultado = num1 / num2

    print(f'Resultado: {resultado}')

# Questiona se o usuário deseja sair, se sim, encerra o loop
    sair = input('Deseja sair? (s/n): ').lower().startswith('s')
    if sair:
        print('Saindo...')
        break

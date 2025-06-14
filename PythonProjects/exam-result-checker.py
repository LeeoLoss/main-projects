# Inicializamos os dados
respostas = [] # Lista para receber as respostas
# Lista de gabaritos
gabarito = ['D', 'A', 'C', 'B', 'A', 'D', 'C', 'C', 'A', 'B']
nota = 0 # Irá acumular a nota total

# Recebemos as respostas do aluno
for i in range(0, 10):
  respostas.append(input(f'Insira a resposta da questão {i + 1}: ').upper())

# Verificamos se as respostas são iguais e adicionamos à nota
for i in range(0,10):
  if respostas[i] == gabarito[i]:
    nota += 1

# Exibindo nota final
print(f'Nota final: {nota}')

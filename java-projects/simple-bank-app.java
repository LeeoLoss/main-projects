// Importa a classe Scanner para entrada de dados via teclado
import java.util.Scanner;

// Declaração da classe principal do programa
public class Conta {

    // Método principal - ponto de entrada da aplicação
    public static void main(String[] args) {
        
        // Declara e inicializa os dados do cliente
        String nome = "Leonardo Loss";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0; // Controla a escolha do usuário no menu

        // Exibe os dados iniciais do cliente
        System.out.println("**************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("**************************");

        // Declara o menu de opções como texto multilinha (text block)
        String menu = """
                ** Digite sua opção: **
                1: Consultar saldo
                2: Transferir valor
                3: Receber valor
                4: Sair
                """;

        // Instancia o Scanner para ler entradas do usuário
        Scanner dados = new Scanner(System.in);

        // Início do laço de repetição - continua até o usuário escolher a opção 4 (sair)
        while (opcao != 4) {
            // Exibe o menu e lê a opção escolhida
            System.out.println(menu);
            opcao = dados.nextInt();

            // Verifica qual opção foi escolhida
            if (opcao == 1) {
                // Caso 1: Exibe o saldo atual
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                // Caso 2: Transferência de valor
                System.out.println("Informe o valor para transferência: ");
                double valor = dados.nextDouble(); // Lê o valor a ser transferido

                if (valor > saldo) {
                    // Verifica se há saldo suficiente
                    System.out.println("Saldo insuficiente para concluir a transferência");
                } else {
                    // Efetua a transferência
                    saldo -= valor;
                    System.out.println("Transferência realizada.");
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao == 3) {
                // Caso 3: Recebimento de valor
                System.out.println("Informe o valor recebido: ");
                double valor = dados.nextDouble(); // Lê o valor a ser adicionado
                saldo += valor;
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao == 4) {
                // Caso 4: Sair do sistema
                System.out.println("Encerrando o sistema...");
            } else {
                // Caso a opção seja inválida
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        // Fecha o scanner após o término do programa
        dados.close();
    }
}

// Interface que define o contrato para conversão financeira
public interface FinancialConversion {
  // Método para converter valor em dólar para real
  void convertDollarToReal(double dollarValue);
}

// Classe que implementa a interface FinancialConversion
public class CurrencyConverter implements FinancialConversion {

  // Implementação do método de conversão do dólar para real
  @Override
  public void convertDollarToReal(double dollarValue) {
    // Taxa de câmbio fixa para conversão
    double dollarExchangeRate = 5.42;
    // Calcula o valor em reais multiplicando o valor em dólar pela taxa
    double realValue = dollarValue * dollarExchangeRate;
    // Exibe o resultado da conversão no console
    System.out.println("The value in reais is: R$" + realValue);
  }
}

// Classe para testar a funcionalidade do conversor
public class CurrencyConverterTest {
  public static void main(String[] args) {
    // Cria uma instância do conversor de moedas
    CurrencyConverter converter = new CurrencyConverter();
    // Chama o método para converter 50 dólares para reais
    converter.convertDollarToReal(50);
  }
}

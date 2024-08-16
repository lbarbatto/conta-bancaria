import java.util.Scanner;


public class TerminalBancario {


    public static void main(String[] args) {
        
        criarContaBancaria();
    }

    public static void criarContaBancaria () {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 100.00;
            
            System.out.println("Por favor, digite o nome do titular da conta: ");
            String nome = scanner.next();
            
            System.out.println("Por favor, digite o número da Agência: ");
            String agencia = scanner.next();
            
            System.out.println("Por favor, digite o número da Conta: ");
            int numero = scanner.nextInt();
            
            ContaBancaria conta = new ContaBancaria (nome, agencia, numero, saldo);
            System.out.println(conta.confirmarDados());
        }
        
    }

    public void realizarSaque (Scanner scanner, int valor) {

    }
    
}

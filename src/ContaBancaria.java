public class ContaBancaria {
    
    private int numero;
    private String agencia;
    private String nome;
    private double saldo;

    public ContaBancaria (String nome, String agencia, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void depositar (double valor) {
        saldo = saldo + valor;
    }

    public void sacar (double valor) {
        saldo = saldo - valor;
    }

    public void imprimirSaldo () {
        System.out.println("Saldo: " + saldo);
    }

    public String confirmarDados () {
        String mensagem = "Olá " + this.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque.";
        return mensagem;
    }
}

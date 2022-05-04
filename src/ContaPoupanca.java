public class ContaPoupanca extends Conta {

    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int conta, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
        super(conta, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque no valor de R$ " + valor + " efetuado com sucesso.");

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito no valor de R$ " + valor + " efetuado com sucesso.");
    }

    public double getSaldo() {
        return this.saldo + (this.taxaDeJuros * this.saldo);

    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }
}

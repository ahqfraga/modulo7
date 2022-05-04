public class ContaSalario extends Conta {

    private int limiteSaque;
    private int qtdSaquesRealizados;

    public ContaSalario(int conta, int agencia, String banco, double saldo, int limiteSaque, int qtdSaquesRealizados) {
        super(conta, agencia, banco, saldo);
        this.limiteSaque = limiteSaque;
        this.qtdSaquesRealizados = qtdSaquesRealizados;
    }

    @Override
    public void sacar(double valor) {
        if (qtdSaquesRealizados <= limiteSaque) {
            saldo -= valor;
            System.out.println("Saque no valor de R$ " + valor + " efetuado com sucesso.");
        } else {
            System.out.println("Limite de saque excedido");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito no valor de R$ " + valor + " efetuado com sucesso.");
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public int getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(int limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "limiteSaque=" + limiteSaque +
                '}';
    }

}

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(int conta, int agencia, String banco, double saldo, double chequeEspecial) {
        super(conta, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (saldo + chequeEspecial)) {
            saldo -= valor;
            System.out.println("Saque no valor de R$ " + valor + " efetuado com sucesso.");
        } else {
            System.out.println("Saldo indisponível para saque");
        }
    }



    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito no valor de R$ " + valor + " efetuado com sucesso.");
    }

    public double getSaldo() {
        return this.chequeEspecial + this.saldo;

    }

}


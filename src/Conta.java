public abstract class Conta {

    private int conta;
    private int agencia;
    private String banco;
    protected double saldo;

    public Conta(int conta, int agencia, String banco, double saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    public abstract double getSaldo();

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);


    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "conta=" + conta +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

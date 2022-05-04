public class Main {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 100.00, 1000.00);
        System.out.println("O saldo da conta corrente é R$: " + cc1.getSaldo());
        cc1.depositar(50);
        cc1.sacar(20);
        System.out.println("O saldo atualizo da conta corrente é R$: " + cc1.getSaldo() + "\n");

        ContaCorrente cc2 = new ContaCorrente(22, 1, "Banco AA", 100.00, 1000.00);
        System.out.println("O saldo da conta corrente é R$: " + cc2.getSaldo());
        cc2.depositar(50);
        cc2.sacar(2000);
        System.out.println("O saldo atualizo da conta corrente é R$: " + cc2.getSaldo() + "\n");

        ContaPoupanca cp1 = new ContaPoupanca(33, 1, "Banco AA", 10.00, 20, 0.05);
        System.out.println("O saldo da conta poupança é R$: " + cp1.getSaldo());
        cp1.depositar(50);
        cp1.sacar(20);
        System.out.println("O saldo atualizo da conta poupança é R$: " + cp1.getSaldo() + "\n");

        ContaSalario cs1 = new ContaSalario(44, 1, "Banco AA", 100.00, 5,6);
        System.out.println("O saldo da conta salário é R$: " + cs1.getSaldo());
        cs1.depositar(50);
        cs1.sacar(20);
        System.out.println("O saldo atualizo da conta salário é R$: " + cs1.getSaldo() + "\n");
    }
}

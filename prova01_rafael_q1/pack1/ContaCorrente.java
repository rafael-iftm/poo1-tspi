package prova01_rafael_q1.pack1;

public class ContaCorrente {
    public String nome;
    public String numeroConta;
    private double saldo;

    public ContaCorrente(String nome, String numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void sacar(double valor) {
        double taxa = valor * 0.001; // Taxa de 0,1%
        if (saldo >= valor + taxa) {
            saldo -= (valor + taxa);
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void depositar(double valor) {
        double taxa = valor * 0.001; // Taxa de 0,1%
        saldo += (valor - taxa);
        System.out.println("Depósito realizado com sucesso.");
    }

    public String exibe() {
        return "Nome: " + nome + "\nNúmero da Conta: " + numeroConta + "\nTipo de Conta: Conta Corrente\nSaldo: R$" + saldo;
    }
}

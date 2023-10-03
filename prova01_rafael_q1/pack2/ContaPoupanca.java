package prova01_rafael_q1.pack2;

public class ContaPoupanca {
    public String nome;
    public String numeroConta;
    double saldo;

    public ContaPoupanca(String nome, String numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void sacar(double valor) {
        double taxa = valor * 0.0005; // Taxa de 0,05%
        if (saldo >= valor + taxa) {
            saldo -= (valor + taxa);
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    public String exibe() {
        return "Nome: " + nome + "\nNúmero da Conta: " + numeroConta + "\nTipo de Conta: Conta Poupança\nSaldo: R$" + saldo;
    }
}

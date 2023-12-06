package prova02_rafael.classes;

public class Restricao extends Exception {
    private float saque;
    private float saldo;

    public Restricao(float saque, float saldo) {
        super("Saque de " + saque + " com saldo insuficiente. Saldo atual: " + saldo);
        this.saque = saque;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

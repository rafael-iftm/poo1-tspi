package prova02_rafael.classes;

public class Conta {
    private int numero;
    private Cliente correntista;
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public Conta() {
    }

    public Conta(int numero, Cliente correntista, float saldo) {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public void depositar(float valor, Especial especial) {
        if (especial != null) {
            valor -= especial.defineTaxacao(valor);
        }
        this.saldo += valor;
    }

    public boolean sacar(float valor) throws Restricao {
        if (valor > saldo) {
            throw new Restricao(valor, saldo);
        }

        this.saldo -= valor;
        return true;
    }

    public boolean sacar(float valor, Especial especial) throws Restricao {
        if (valor > saldo) {
            throw new Restricao(valor, saldo);
        }

        if (especial != null) {
            valor += especial.defineTaxacao(valor);
        }

        this.saldo -= valor;
        return true;
    }

    public boolean movimentar(float valor, int operacao) {
        try {
            if (operacao == Movimento.SACAR) {
                return sacar(valor);
            } else if (operacao == Movimento.DEPOSITAR) {
                depositar(valor);
                return true;
            }
            return false;
        } catch (Restricao e) {
            return false;
        }
    }

    public boolean movimentar(float valor, int operacao, Especial especial) {
        try {
            if (operacao == Movimento.SACAR) {
                return sacar(valor, especial);
            } else if (operacao == Movimento.DEPOSITAR) {
                depositar(valor, especial);
                return true;
            }
            return false;
        } catch (Restricao e) {
            return false;
        }
    }
}

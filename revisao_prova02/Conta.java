package revisao_prova02;

public class Conta {
    private int numero;
    private Cliente correntista;
    private float saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
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

        public boolean sacar(float valor) throws Restricoes {
            try {
                if (valor > saldo) {
                    throw new Restricoes("Saque com saldo insuficiente");
                }
                this.saldo -= valor;
                return true;
            } catch (Restricoes e) {
                return false;
            }
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
            } catch (Restricoes e) {
                return false;
            }
        }
    
}

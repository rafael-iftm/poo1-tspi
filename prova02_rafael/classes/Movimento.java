package prova02_rafael.classes;

public class Movimento {
    public static final int SACAR = 0;
    public static final int DEPOSITAR = 1;

    private String data;
    private Conta conta;
    private String historico;
    private float valor;
    private int operacao;
    private float saldoAnterior;

    public String getData() {
        return data;
    }

    public String getHistorico() {
        return historico;
    }

    public float getValor() {
        return valor;
    }

    public int getOperacao() {
        return operacao;
    }

    public Movimento(String data, Conta conta, String historico, float valor, int operacao) {
        this.data = data;
        this.conta = conta;
        this.historico = historico;
        this.valor = valor;
        this.operacao = operacao;
    }

    public boolean movimentar() {
        saldoAnterior = conta.getSaldo();
        if (operacao == SACAR) {
            return conta.movimentar(valor, SACAR);
        } else if (operacao == DEPOSITAR) {
            return conta.movimentar(valor, DEPOSITAR);
        }
        return true;
    }

    public boolean movimentar(Especial especial) {
        saldoAnterior = conta.getSaldo();
        if (operacao == SACAR) {
            float taxa = especial.defineTaxacao(conta.getSaldo());
            return conta.movimentar(valor + taxa, SACAR);
        } else if (operacao == DEPOSITAR) {
            return conta.movimentar(valor, DEPOSITAR);
        }
        return true;
    }
}

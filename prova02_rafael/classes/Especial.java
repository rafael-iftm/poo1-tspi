package prova02_rafael.classes;

public class Especial {
    private float limite;
    private int tempo;

    public Especial() {
    }

    public Especial(float limite, int tempo) {
        this.limite = limite;
        this.tempo = tempo;
    }

    public float defineTaxacao(float saldo) {
        if (tempo < 12 || (tempo >= 12 && tempo <= 23 && saldo <= 0)) {
            return 0.002f * saldo; // 0.2%
        } else if (tempo >= 12 && tempo <= 23 && saldo > 0) {
            return 0.0015f * saldo; // 0.15%
        } else {
            return 0.001f * saldo; // 0.1%
        }
    }
}

package exercicio_02;

public class Circulo {
    private double Xc, Yc;
    double raio;

    public Circulo(double Xc, double Yc, double raio) {
        this.Xc = Xc;
        this.Yc = Yc;
        this.raio = raio;
    }

    public double calculaArea() {
        return (Math.PI * Math.pow(raio, 2));
    }

    public double calculaComprimento() {
        return (2 * Math.PI * raio);
    }

    public String exibe() {
        return """
            Centro = (%f, %f)
            Círculo - Raio: %f
            Área: %f
            Comprimento: %f
            """.formatted(Xc, Yc, raio, calculaArea(), calculaComprimento());
    }
}

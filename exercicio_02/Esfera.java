package exercicio_02;

public class Esfera {

    public Esfera() {
    }

    public double calculaArea(double areaCirculo) {
        return (4 * areaCirculo);
    }

    public double calculaVolume(double raio) {
        return ((4.0 / 3) * Math.PI * Math.pow(raio, 3));
    }

    public String exibe(double raio, double areaCirculo) {
        return """
            [Esfera]
            Raio: %f
            Área: %f
            Volume: %f
            """.formatted(raio, calculaArea(areaCirculo), calculaVolume(raio));
    }
}

package exercicio_02;

public class Cone {
    private double altura;

    public Cone(double altura) {
        this.altura = altura;
    }

    public double calculaArea(double raio) {
        double geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
        return (Math.PI * raio * (raio + geratriz));
    }

    public double calculaVolume(double areaCirculo) {
        return ((1.0 / 3) * areaCirculo * altura);
    }

    public String exibe(double raio) {
        return "Cone - Raio da Base: " + raio + " Altura: " + altura;
    }

    public String exibe(double raio, double areaCirculo) {
        return """
            [Cone]
            Raio: %f
            Altura: %f
            Área: %f
            Volume: %f
            """.formatted(raio, altura, calculaArea(raio), calculaVolume(areaCirculo));
    }
}

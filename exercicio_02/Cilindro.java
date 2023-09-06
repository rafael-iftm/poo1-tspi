package exercicio_02;

public class Cilindro {
    private double altura;

    public Cilindro(double altura) {
        this.altura = altura;
    }

    public double calculaArea(double raio, double areaCirculo) {
        return (2 * areaCirculo + altura * 2 * Math.PI * raio);
    }

    public double calculaVolume(double areaCirculo) {
        return (areaCirculo * altura);
    }

    public String exibe(double raio) {
        return "Cilindro - Raio: %f Altura: %f".formatted(raio, altura);
    }    
}

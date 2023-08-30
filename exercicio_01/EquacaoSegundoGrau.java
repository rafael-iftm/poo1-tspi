package exercicio_01;

public class EquacaoSegundoGrau {
    public void calculaEquacaoSegundoGrau(double a, double b, double c) {
        double discriminante = delta(a, b, c);

        if (discriminante > 0) {
            double x1 = calculaX1(a, b, discriminante);
            double x2 = calculaX2(a, b, discriminante);
            System.out.println("Raiz 1 (x1): " + x1);
            System.out.println("Raiz 2 (x2): " + x2);

        } else if (discriminante == 0) {
            double x1 = calculaX1(a, b, discriminante);
            System.out.println("Raiz Dupla (x1 = x2): " + x1);

        } else {
            System.out.println("Sem raízes reais.");
        }
    }

    public double delta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public double calculaX1(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public double calculaX2(double a, double b, double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }
}

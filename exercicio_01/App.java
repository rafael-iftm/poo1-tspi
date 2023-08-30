package exercicio_01;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double a, b, c;
        a = le();
        b = le();
        c = le();
        EquacaoSegundoGrau EGrau2 = new EquacaoSegundoGrau();
        EGrau2.calculaEquacaoSegundoGrau(a, b, c);
    }

    public static double le() {
        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        return num;
    }
}

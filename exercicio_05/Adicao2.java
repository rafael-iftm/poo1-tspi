// Repare a sobrecarga - No Adicao 1 (addInt, addFloat, exibeInt e exibeFloat)

package exercicio_05;

public class Adicao2 {
    public int add(int a, int b){
        return a + b;
    }

    public float add(float c, float d){
        return c + d;
    }

    public String exibe(int a, int b, int soma){
        return """
            a: %s
            b: %s
            soma: %s""".formatted(a, b, soma);
    }

    public String exibe(float c, float d, float soma){
        return """
            c: %s
            d: %s
            soma: %s""".formatted(c, d, soma);
    }
}

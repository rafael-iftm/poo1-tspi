package exercicio_05;

public class Adicao {
    public int addInt(int a, int b){
        return a + b;
    }

    public float addFloat(float c, float d){
        return c + d;
    }

    public String exibeInt(int a, int b, int soma){
        return """
            a: %s
            b: %s
            soma: %s""".formatted(a, b, soma);
    }

    public String exibeFloat(float c, float d, float soma){
        return """
            c: %s
            d: %s
            soma: %s""".formatted(c, d, soma);
    }
}

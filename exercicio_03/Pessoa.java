package exercicio_03;

public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;

    public Pessoa(String nome, char sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String exibe(){
        return "Pessoa - Nome: %s Sexo: %c Idade: %d".formatted(nome, sexo, idade);
    }
}

package exercicio_03;

public class Formacao {
    private String nivel, instituicao;
    private boolean concluido;
    private int ano;

    public Formacao(String nivel, boolean concluido, String instituicao, int ano){
        this.nivel = nivel;
        this.concluido = concluido;
        this. instituicao = instituicao;
        this.ano = ano;
    }

    public String exibe(){
        return "Formacao - Nivel: %s Concluido: %b Instituicao: %s Ano: %d".formatted(nivel, concluido, instituicao, ano);
    }
}

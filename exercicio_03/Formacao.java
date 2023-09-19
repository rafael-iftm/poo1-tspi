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
        return """
            Nivel: %s
            Concluido: %b
            Instituicao: %s
            Ano: %d""".formatted(nivel, concluido, instituicao, ano);
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
    
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getNivel() {
        return nivel;
    }
    
    public boolean isConcluido() {
        return concluido;
    }
    
    public String getInstituicao() {
        return instituicao;
    }
    
    public int getAno() {
        return ano;
    }

    public void atualizarStatusConclusao(int novoAno) {
        if (!concluido) {
            if (novoAno == ano + 1) {
                concluido = true;
                ano = novoAno;
            }
        }
    }
}

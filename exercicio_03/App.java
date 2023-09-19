package exercicio_03;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static Formacao formacao;
    private static Pessoa pessoa;

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("Menu Principal:");
            System.out.println("1 - Pessoa");
            System.out.println("2 - Formacao");
            System.out.println("3 - SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                pessoa = lePessoa(); // Atribuir o resultado de lePessoa() a pessoa
                System.out.println("===================================================");
                System.out.println("Informações da pessoa:");
                System.out.println(pessoa.exibe());
                System.out.println("===================================================");
                break;
                case 2:
                    formacao = leFormacao(); // Atribuir o resultado de leFormacao() a formacao
                    System.out.println("===================================================");
                    System.out.println("Informações da formação:");
                    System.out.println(formacao.exibe());
                    System.out.println("===================================================");
                    // Perguntar se a pessoa concluiu o curso no ano seguinte
                    System.out.print("A pessoa concluiu o curso no ano seguinte? (true ou false): ");
                    boolean concluiuNoAnoSeguinte = scanner.nextBoolean();
                
                    // Atualizar os dados da formação
                    if (concluiuNoAnoSeguinte) {
                        int novoAno = formacao.getAno() + 1;
                        formacao.atualizarStatusConclusao(novoAno);
                    }

                    System.out.println("===================================================");
                    System.out.println("Informações da formação atualizadas:");
                    System.out.println(formacao.exibe());
                    System.out.println("===================================================");
                    break;
                case 3:
                    System.out.println("========================");
                    System.out.println("Saindo do programa.");
                    System.out.println("========================");
                    break;
                default:
                    System.out.println("=================================");
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("=================================");
            }
        } while (opcao != 3);
    }

    private static Pessoa lePessoa() {
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.next();
        System.out.print("Digite o sexo da pessoa (H ou M): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        
        // Crie um objeto Pessoa com os dados lidos e retorne-o
        return new Pessoa(nome, sexo, idade);
    }

    private static Formacao leFormacao() {
        System.out.print("Digite o nível da formação: ");
        String nivel = scanner.next();
        System.out.print("Digite se foi concluída a formação (true ou false): ");
        boolean concluida = scanner.nextBoolean();
        System.out.print("Digite o nome da instituição da formação: ");
        String instituicao = scanner.next();
        System.out.print("Digite o ano da formação: ");
        int ano = scanner.nextInt();
        
        // Crie um objeto Formacao com os dados lidos e retorne-o
        return new Formacao(nivel, concluida, instituicao, ano);
    }
}

package exercicio_05;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("Menu Principal:");
            System.out.println("1 - Inteiros");
            System.out.println("2 - Reais");
            System.out.println("3 - SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Opção para números inteiros
                    System.out.println("===================================================");
                    processarInteiros();
                    System.out.println("===================================================");
                    break;
                case 2:
                    // Opção para números reais
                    System.out.println("===================================================");
                    processarReais();
                    System.out.println("===================================================");
                    break;
                case 3:
                    // Sair do programa
                    System.out.println("===================================================");
                    System.out.println("Saindo do programa.");
                    System.out.println("===================================================");
                    break;
                default:
                    System.out.println("===================================================");
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("===================================================");
            }

        } while (opcao != 3);

        scanner.close();
    }

    private static void processarInteiros() {
        // Passo 1: Ler dois números inteiros
        System.out.print("Digite o valor de A (inteiro): ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de B (inteiro): ");
        int b = scanner.nextInt();

        // Criar uma instância da classe Dados com os números inteiros lidos
        Dados dadosInteiros = new Dados(a, b);

        // Passo 2: Somar os números inteiros usando a classe Adicao
        Adicao adicao = new Adicao();
        int somaInteiros = adicao.addInt(dadosInteiros.getA(), dadosInteiros.getB());

        // Passo 3: Exibir o resultado da soma
        String resultadoInteiros = adicao.exibeInt(a, b, somaInteiros);
        System.out.println("\nResultado da Soma (Números Inteiros):");
        System.out.println(resultadoInteiros);
    }

    private static void processarReais() {
        // Passo 1: Ler dois números reais
        System.out.print("Digite o valor de C (real): ");
        float c = scanner.nextFloat();
        System.out.print("Digite o valor de D (real): ");
        float d = scanner.nextFloat();

        // Criar uma instância da classe Dados com os números reais lidos
        Dados dadosReais = new Dados(c, d);

        // Passo 2: Somar os números reais usando a classe Adicao
        Adicao adicao = new Adicao();
        float somaReais = adicao.addFloat(dadosReais.getC(), dadosReais.getD());

        // Passo 3: Exibir o resultado da soma
        String resultadoReais = adicao.exibeFloat(c, d, somaReais);
        System.out.println("\nResultado da Soma (Números Reais):");
        System.out.println(resultadoReais);
    }
}

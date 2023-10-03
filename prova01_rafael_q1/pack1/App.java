package prova01_rafael_q1.pack1;

import java.util.Scanner;

import prova01_rafael_q1.pack2.ContaPoupanca;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static ContaPoupanca contaPoupanca;
    private static ContaCorrente contaCorrente;

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("Menu Principal:");
            System.out.println("1 - Conta Poupança");
            System.out.println("2 - Conta Corrente");
            System.out.println("3 - SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Opção para Conta Poupança
                    System.out.println("===================================================");
                    menuPoupanca();
                    System.out.println("===================================================");
                    break;
                case 2:
                    // Opção para Conta Corrente
                    System.out.println("===================================================");
                    menuCorrente();
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

    private static void menuPoupanca() {
        int opcao;

        System.out.println("\nMenu Poupança:");
        System.out.println("1 - Criar Conta Poupança");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Exibir");
        System.out.println("5 - VOLTAR");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                contaPoupanca = leDadosPoupanca();
                System.out.println("Conta Poupança criada com sucesso.");
                break;
            case 2:
                if (contaPoupanca != null) {
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    contaPoupanca.depositar(valorDeposito);
                } else {
                    System.out.println("Crie uma conta Poupança primeiro.");
                }
                break;
            case 3:
                if (contaPoupanca != null) {
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    contaPoupanca.sacar(valorSaque);
                } else {
                    System.out.println("Crie uma conta Poupança primeiro.");
                }
                break;
            case 4:
                if (contaPoupanca != null) {
                    System.out.println(contaPoupanca.exibe());
                } else {
                    System.out.println("Crie uma conta Poupança primeiro.");
                }
                break;
            case 5:
                System.out.println("Voltando ao menu principal.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void menuCorrente() {
        int opcao;

        System.out.println("\nMenu Conta Corrente:");
        System.out.println("1 - Criar Conta Corrente");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Exibir");
        System.out.println("5 - VOLTAR");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                contaCorrente = leDadosContaCorrente();
                System.out.println("Conta Corrente criada com sucesso.");
                break;
            case 2:
                if (contaCorrente != null) {
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    contaCorrente.depositar(valorDeposito);
                } else {
                    System.out.println("Crie uma conta Corrente primeiro.");
                }
                break;
            case 3:
                if (contaCorrente != null) {
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    contaCorrente.sacar(valorSaque);
                } else {
                    System.out.println("Crie uma conta Corrente primeiro.");
                }
                break;
            case 4:
                if (contaCorrente != null) {
                    System.out.println(contaCorrente.exibe());
                } else {
                    System.out.println("Crie uma conta Corrente primeiro.");
                }
                break;
            case 5:
                System.out.println("Voltando ao menu principal.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static ContaPoupanca leDadosPoupanca() {
        // Ler os dados da conta poupança
        System.out.print("Digite o Nome: ");
        String nome = scanner.next();
        System.out.print("Digite o Numero da Conta: ");
        String numeroConta = scanner.next();

        // Cria um objeto ContaPoupanca com os dados lidos e retorne-o
        return new ContaPoupanca(nome, numeroConta);
    }

    private static ContaCorrente leDadosContaCorrente() {
        // Ler os dados da conta corrente
        System.out.print("Digite o Nome: ");
        String nome = scanner.next();
        System.out.print("Digite o Numero da Conta: ");
        String numeroConta = scanner.next();

        // Cria um objeto ContaCorrente com os dados lidos e retorne-o
        return new ContaCorrente(nome, numeroConta);
    }
}

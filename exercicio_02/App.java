package exercicio_02;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static Circulo circulo;
    private static Cilindro cilindro;
    private static Cone cone;
    private static Esfera esfera;
    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("Menu Principal:");
            System.out.println("1 - Circulo");
            System.out.println("2 - Cilindro");
            System.out.println("3 - Cone");
            System.out.println("4 - Esfera");
            System.out.println("5 - SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuCirculo();
                    break;
                case 2:
                    menuCilindro();
                    break;
                case 3:
                    menuCone();
                    break;
                case 4:
                    menuEsfera();
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void menuCirculo() {
        int opcao;

        System.out.println("\nMenu Circulo:");
        System.out.println("1 - Dados do Circulo");
        System.out.println("2 - Área do Circulo");
        System.out.println("3 - Comprimento do Circulo");
        System.out.println("4 - VOLTAR");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                double Xc = leCoordenada();
                double Yc = leCoordenada();
                double raio = leRaio();
                circulo = new Circulo(Xc, Yc, raio);
                break;
            case 2:
                if (circulo != null) {
                    System.out.println("Área do Circulo: " + circulo.calculaArea());
                } else {
                    System.out.println("Círculo ainda não foi criado.");
                }
                break;
            case 3:
                if (circulo != null) {
                    System.out.println("Comprimento do Circulo: " + circulo.calculaComprimento());
                } else {
                    System.out.println("Círculo ainda não foi criado.");
                }
                break;
            case 4:
                System.out.println("Voltando ao menu principal.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void menuCilindro() {
        int opcao;

        System.out.println("\nMenu Cilindro:");
        System.out.println("1 - Dados do Cilindro");
        System.out.println("2 - Área do Cilindro");
        System.out.println("3 - Volume do Cilindro");
        System.out.println("4 - Exibir informações do Cilindro"); // Opção adicional para exibir informações
        System.out.println("5 - VOLTAR");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                double altura = leAltura();
                cilindro = new Cilindro(altura);
                break;
            case 2:
                if (cilindro != null && circulo != null) {
                    System.out.println("Área do Cilindro: " + cilindro.calculaArea(circulo.raio, circulo.calculaArea()));
                } else {
                    System.out.println("Cilindro ou Círculo ainda não foram criados.");
                }
                break;
            case 3:
                if (cilindro != null && circulo != null) {
                    System.out.println("Volume do Cilindro: " + cilindro.calculaVolume(circulo.calculaArea()));
                } else {
                    System.out.println("Cilindro ou Círculo ainda não foram criados.");
                }
                break;
            case 4:
                if (cilindro != null && circulo != null) {
                    System.out.println(cilindro.exibe(circulo.raio, circulo.calculaArea()));
                } else {
                    System.out.println("Cilindro ou Círculo ainda não foram criados.");
                }
                break;
            case 5:
                System.out.println("Voltando ao menu principal.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void menuCone() {
        int opcao;

        System.out.println("\nMenu Cone:");
        System.out.println("1 - Dados do Cone");
        System.out.println("2 - Área do Cone");
        System.out.println("3 - Volume do Cone");
        System.out.println("4 - Exibir informações do Cone"); // Opção adicional para exibir informações
        System.out.println("5 - VOLTAR");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                double altura = leAltura();
                cone = new Cone(altura);
                break;
            case 2:
                if (cone != null && circulo != null) {
                    System.out.println("Área do Cone: " + cone.calculaArea(circulo.raio));
                } else {
                    System.out.println("Cone ou Círculo ainda não foram criados.");
                }
                break;
            case 3:
                if (cone != null && circulo != null) {
                    System.out.println("Volume do Cone: " + cone.calculaVolume(circulo.calculaArea()));
                } else {
                    System.out.println("Cone ou Círculo ainda não foram criados.");
                }
                break;
            case 4:
                if (cone != null && circulo != null) {
                    System.out.println(cone.exibe(circulo.raio, circulo.calculaArea()));
                } else {
                    System.out.println("Cone ou Círculo ainda não foram criados.");
                }
                break;
            case 5:
                System.out.println("Voltando ao menu principal.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
    
    private static void menuEsfera() {
        int opcao;

        System.out.println("\nMenu Esfera:");
        System.out.println("1 - Dados da Esfera");
        System.out.println("2 - Área da Esfera");
        System.out.println("3 - Volume da Esfera");
        System.out.println("4 - Exibir informações da Esfera"); // Opção adicional para exibir informações
        System.out.println("5 - VOLTAR");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                esfera = new Esfera();
                break;
            case 2:
                if (esfera != null && circulo != null) {
                    System.out.println("Área da Esfera: " + esfera.calculaArea(circulo.calculaArea()));
                } else {
                    System.out.println("Esfera ou Círculo ainda não foram criados.");
                }
                break;
            case 3:
                if (esfera != null && circulo != null) {
                    System.out.println("Volume da Esfera: " + esfera.calculaVolume(circulo.raio));
                } else {
                    System.out.println("Esfera ou Círculo ainda não foram criados.");
                }
                break;
            case 4:
                if (esfera != null && circulo != null) {
                    System.out.println(esfera.exibe(circulo.raio, circulo.calculaArea()));
                } else {
                    System.out.println("Cone ou Círculo ainda não foram criados.");
                }
                break;
            case 5:
                System.out.println("Voltando ao menu principal.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static double leCoordenada() {
        System.out.print("Digite a coordenada: ");
        return scanner.nextDouble();
    }

    private static double leRaio() {
        System.out.print("Digite o raio: ");
        return scanner.nextDouble();
    }

    private static double leAltura() {
        System.out.print("Digite a altura: ");
        return scanner.nextDouble();
    }
}

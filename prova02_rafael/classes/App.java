package prova02_rafael.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<String> usuariosAutorizados = new ArrayList<>();
    private static List<String> senhasAutorizadas = new ArrayList<>();

    static {
        usuariosAutorizados.add("teste");
        senhasAutorizadas.add("123");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean encerrar = false;

        while (!encerrar) {
            int tentativas = 0;
            Cliente cliente = null;
            Conta conta = null;
            Especial especial = null;

            while (tentativas < 3) {
                System.out.print("Digite seu usuário: ");
                String usuario = scanner.nextLine();
                System.out.print("Digite sua senha: ");
                String senha = scanner.nextLine();

                if (validarCredenciais(usuario, senha)) {
                    cliente = new Cliente("Fulano", "123.456.789-00");

                    int tipo = escolherTipoConta(scanner);

                    conta = new Conta(102030, cliente, 1000.0f);

                    if (tipo == 2) {
                        especial = new Especial(500.0f, 15);
                    }

                    float saldoAnterior = conta.getSaldo();
                    Transacao transacoes = new Transacao();

                    if (tipo == 1) {
                        transacoes.realizarTransacao("11/11/2023", conta, "Depósito Dinheiro", 300.0f, Movimento.DEPOSITAR);
                        transacoes.realizarTransacao("12/11/2023", conta, "Saque Dinheiro", 150.0f, Movimento.SACAR);
                    } else if (tipo == 2) {
                        transacoes.realizarTransacao("11/11/2023", conta, especial, "Depósito Dinheiro", 300.0f, Movimento.DEPOSITAR);
                        transacoes.realizarTransacao("12/11/2023", conta, especial, "Saque Dinheiro", 150.0f, Movimento.SACAR);
                    }

                    exibirRelatorio(cliente, saldoAnterior, conta, transacoes.getMovimentos());
                    break;
                } else {
                    System.out.println("Acesso não autorizado. Tente novamente.");
                    tentativas++;
                }
            }

            if (tentativas == 3) {
                System.out.println("Você excedeu o número máximo de tentativas.");
                System.out.print("Deseja redefinir usuário e senha? (S/N): ");
                String resposta = scanner.nextLine().toUpperCase();

                if (resposta.equals("S")) {
                    redefinirUsuarioSenha(scanner);
                } else {
                    encerrar = true;
                }
            }
        }

        scanner.close();
    }

    private static boolean validarCredenciais(String usuario, String senha) {
        Validacao validacao = new Validacao();
        return validacao.validaSenha(senha, senhasAutorizadas);
    }

    private static int escolherTipoConta(Scanner scanner) {
        System.out.println("Escolha o tipo de conta:");
        System.out.println("1 - Conta Comum");
        System.out.println("2 - Conta Especial");
        System.out.print("Digite o número correspondente: ");

        int tipo = scanner.nextInt();
        scanner.nextLine();

        return tipo;
    }

    private static void redefinirUsuarioSenha(Scanner scanner) {
        System.out.print("Digite seu novo usuário: ");
        String novoUsuario = scanner.nextLine();

        String novaSenha;
        do {
            System.out.print("Digite sua nova senha (pelo menos 6 caracteres, 1 dígito e 1 caractere especial): ");
            novaSenha = scanner.nextLine();
        } while (!senhaAtendeRequisitos(novaSenha));

        if (usuariosAutorizados.contains(novoUsuario)) {
            // Se o usuário já existe, apenas redefine a senha
            int index = usuariosAutorizados.indexOf(novoUsuario);
            senhasAutorizadas.set(index, novaSenha);
        } else {
            // Se o usuário não existe, adiciona nas listas
            usuariosAutorizados.add(novoUsuario);
            senhasAutorizadas.add(novaSenha);
        }

        System.out.println("Usuário e senha redefinidos com sucesso.");
    }

    private static void exibirRelatorio(Cliente cliente, float saldoAnterior, Conta conta, List<Movimento> movimentos) {
        System.out.println("=========================================");
        System.out.println("Emitindo extrato da conta número: " + conta.getNumero());
        System.out.println("Correntista: " + cliente.getNome());
        System.out.println("Saldo anterior: " + saldoAnterior);
        System.out.println("=========================================");

        for (Movimento movimento : movimentos) {
            System.out.println("Data: " + movimento.getData());
            System.out.println("Histórico: " + movimento.getHistorico());
            System.out.println("Valor: " + movimento.getValor());
            if (movimento.getOperacao() == Movimento.DEPOSITAR) {
                System.out.println("Operação: Depósito");
            } else {
                System.out.println("Operação: Saque");
            }
            System.out.println("------------------------");
        }

        System.out.println("Saldo Final: " + conta.getSaldo());
    }

    private static boolean senhaAtendeRequisitos(String senha) {
        return senha.length() >= 6 && senha.matches(".*\\d.*") && senha.matches(".*[$#@].*");
    }
}

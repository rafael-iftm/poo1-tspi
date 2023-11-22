package revisao_prova02;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rafael", "021.029.306-37");
        Conta conta = new Conta(1, cliente, 1000.0f);

        Transacao transacoes = new Transacao();

        float saldoAnterior = conta.getSaldo();

        transacoes.realizarTransacao("2023-11-21", conta, 500.0f, "Depósito Dinheiro", Movimento.DEPOSITAR);
        transacoes.realizarTransacao("2023-11-22", conta, 300.0f, "Saque Dinheiro", Movimento.SACAR);

        List<Movimento> movimentos = transacoes.getMovimentos();

        System.out.println("=========================================");
        System.out.println("Emitindo relatório do CPF: " + cliente.getCpf());
        System.out.println("Correntista: " + cliente.getNome());
        System.out.println("Saldo Inicial: " + saldoAnterior);
        System.out.println("=========================================");

        for (Movimento movimento : movimentos) {
            System.out.println("Data: " + movimento.getData());
            System.out.println("Histórico: " + movimento.getHistorico());
            System.out.println("Valor: " + movimento.getValor());
            if (movimento.getOperacao() == Movimento.DEPOSITAR) {
                System.out.println("Operação: Depósito");
            }
            else {
                System.out.println("Operação: Saque");
            }
            System.out.println("------------------------");
        }

        System.out.println("Saldo Final: " + conta.getSaldo());
    }
}


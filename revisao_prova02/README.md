# Sistema Bancário Simples

Este é um programa Java que simula operações bancárias básicas, como depósito e saque, utilizando classes para representar clientes, contas, transações e movimentos financeiros.

## Estrutura do Projeto

O projeto é organizado em pacotes da seguinte forma:

- `revisao_prova02`: Contém as classes principais do programa.
    - `App.java`: Classe principal que inicia o programa.
    - `Cliente.java`: Representa um cliente do banco.
    - `Conta.java`: Representa uma conta bancária.
    - `Movimento.java`: Representa um movimento financeiro.
    - `Restricoes.java`: Exceção personalizada para tratamento de restrições.
    - `Transacao.java`: Responsável por realizar transações e armazenar movimentos.

## Funcionalidades

O programa possui as seguintes funcionalidades:

1. **Autenticação**: Antes de realizar operações, o usuário é solicitado a fornecer uma senha para autenticação. Senhas autorizadas estão associadas aos CPFs dos clientes.

2. **Operações Bancárias**: O programa simula operações como depósito e saque em contas bancárias.

3. **Geração de Relatório**: Após as transações, o programa emite um relatório contendo informações sobre o correntista, o saldo inicial, as transações realizadas e o saldo final.

## Como Utilizar

1. Compile o código Java.
   ```bash
   javac revisao_prova02/*.java
   ```

2. Execute o programa.
   ```bash
   java revisao_prova02.App
   ```

**Observação:** A senha padrão está configurada como "123".

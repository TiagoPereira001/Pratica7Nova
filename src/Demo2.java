public class Demo2 {
    public static void main(String[] args) {
        Banco meuBanco = new Banco();

        // Conta normal
        Conta c1 = new Conta(1);

        // Conta Poupança
        ContaPoupanca c2 = new ContaPoupanca(2, 0.05);

        // Conta Corrente
        ContaCorrente c3 = new ContaCorrente(1, 100);

        // Adicionar as contas à lista do banco
        meuBanco.adicionarConta(c1);
        meuBanco.adicionarConta(c2);
        meuBanco.adicionarConta(c3);

        System.out.println("Banco criado e contas criadas");
    }
}
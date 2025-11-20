public class Demo2 {
    public static void main(String[] args) {
        Banco meuBanco = new Banco();

        // Abrir Conta
        Conta A1 =new AbrirConta
        // Conta Poupança
        ContaPoupanca c2 = new ContaPoupanca(2, 0.05);

        // Conta Corrente
        ContaCorrente c3 = new ContaCorrente(1, 100);

        // Adicionar as contas à lista do banco
        meuBanco.adicionarConta();
        meuBanco.adicionarConta();
        meuBanco.adicionarConta();

        System.out.println("Banco criado e contas criadas");
    }
}
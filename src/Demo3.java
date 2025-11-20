public class Demo3 {
    public static void main(String[] args) {
        Banco meuBanco = new Banco();

        // Conta Poupança
        ContaPoupanca c2 = new ContaPoupanca(2, 0.05);

        // Conta Corrente
        ContaCorrente c3 = new ContaCorrente(1, 100);

        Conta C1 = new Conta(3);

        // Adicionar as contas à lista do banco
        meuBanco.adicionarConta(c2);
        meuBanco.adicionarConta(c3);
        meuBanco.adicionarConta(C1);

        c2.depositar(100);

        c3.levantar(200);
        System.out.println("Estado Inicial");
        c2.print();
        c3.print();
        c3.print();
        System.out.print();

        System.out.print("Executar atualizaçao");
        meuBanco.AtualizarContas();
        System.out.print();

        System.out.println("pagar dividas");
        meuBanco.Pagardividendo(30.0);
        System.out.println();

        System.out.println("Final");
        c2.print();
        c3.print();
        C1.print();
    }
}
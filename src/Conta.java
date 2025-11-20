/**
 * Uma classe para contas bancárias.
 * Fornece a funcionalidade básica de contas.
 * Permitir depósitos e levantamentos.
 */

public class Conta {
    // Para fazer o saldo visivel em classes do
    // mesmo pacote e em classes derivadas pode mudar o acesso
    // para protected
    // alternativamente pode criar um setter .. também protected
    protected double saldo; // Saldo atual

    private int numero; // numero da conta

    public Conta(int numero) {
        this.saldo = 0.0;
        this.numero = numero;
    }

    public void depositar(double soma) {
        if (soma > 0) {
            saldo += soma;
        } else
            System.err.println("Account.depositar(): "
                    + "nao pode depositar um valor negativo.");
    }

    public void levantar(double soma) {
        if (soma > 0) {
            if (saldo <= soma) {
                saldo -= soma;
            } else {
                System.err.println("Conta .levantar(): Saldo Insuficiente.");
            }
            // Deviamos Verificar que a conta tem saldo suficiente
            // quer dizer verificar que saldo >=soma
            saldo -= soma;
        } else
            System.err.println("Conta.levantar(): "
                    + "nao pode levantar um valor negativo.");
    }

    public double getSaldo() {
        return saldo;
    }

    public double getContaNumero() {
        return numero;
    }

    public String toString() {
        return "Nº Conta " + numero + ": " + "saldo = " + saldo;
    }

    public final void print() {
        System.out.println(toString());
    }

}

public class ContaCorrente extends Conta{
    private double limite;
    // construtor
    public ContaCorrente(int numero,double limite) {
        super(numero);
        this.limite = limite;
    }
    // metodo Override para garantir que estou a substituir o metodo da calsse conta
    @Override
    public void levantar(double soma){
        if (soma > 0) {
            if ((getSaldo() + limite) >= soma) {
                saldo -= soma;
            } else {
                System.err.println("Saldo e limite insuficiente");
            }
        } else {
            System.err.println("valor negativo");
        }
    }
}

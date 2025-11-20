public class ContaPoupanca extends Conta{
    private double taxaJuros;
    public ContaPoupanca(int numero, double taxaJuros) {
        super(numero);
        this.taxaJuros = taxaJuros;
    }
    public void adicionarJuros() {
        double juros = getSaldo() + taxaJuros;
        depositar(juros);
        System.out.println("Juros Atuais: " + juros);
    }
}

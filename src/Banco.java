import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas;
    // construtor
    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void  adicionarConta(Conta conta) {
        this.contas.add(conta);
    }
    public ArrayList<Conta> getContas() {
        return contas;
    }
    public void AtualizarContas() {
        if (Conta 'c' : contas); {
            ContaPoupanca cp = (ContaPoupanca) contas;
            cp.adicionarJuros();
        }
        else if (contas instanceof ContaCorrente) {
            ContaCorrente cc = (ContaCorrente) contas;
            if (cc.getSaldo() < 0) {
                System.out.println("CARTA enviada" + cc.getContaNumero()
                        + "saldo negativo" + cc.getSaldo();
                }
        }
        public void abrirConta(Conta c) {
            contas.add(contas);
        }

        // Método para remover contas (fechar conta)
        public void fecharConta(Conta contas) {
            contas.remove(contas);
        }
        }
    }
}

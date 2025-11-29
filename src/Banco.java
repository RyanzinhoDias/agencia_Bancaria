import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas;

    public Banco(){
        contas = new ArrayList<Conta>();
    }

    public void inserirConta(Conta novaConta){
        contas.add(novaConta);
        novaConta.impressao();
    }

    public Conta busca(int numeroDaConta){
        for (Conta c : contas){
            if (c.getNumeroConta() == numeroDaConta){
                return c;
            }
        }
        return null;
    }

    public void depositar(int numeroDaConta, double valor){
        if (busca(numeroDaConta) != null) {
            busca(numeroDaConta).deposito(valor);
        } else {
            System.out.println("CONTA NÂO LOCALIZADA");
        }
    }

    public void exibirSaldo(int numeroDaConta){
        if (busca(numeroDaConta) != null) {
            busca(numeroDaConta).saldo();
        } else {
                System.out.println("CONTA NÂO LOCALIZADA");
        }
    }

    public void sacar(int numeroDaConta, double valor){
        if (busca(numeroDaConta) != null){
            if (busca(numeroDaConta).saque(valor)) {
                System.out.println("SAQUE REALIZADO COM SUCESSO!");
            } else {
                System.out.println("!!! ATENÇÃO: NÃO FOI POSSÍVEL REALIZAR O SAQUE!!!");
            }
        } else {
            System.out.println("CONTA NÂO LOCALIZADA");
        }
    }

    public void transferir(int numeroDaContaSaida, int numeroDaContaDestino, double valorTransferido){
        Conta contaSaida = busca(numeroDaContaSaida);
        Conta contaDestino = busca((numeroDaContaDestino));
        if (contaSaida != null && contaDestino != null){
            contaSaida.tranferencia(contaSaida, contaDestino, valorTransferido);
        } else {
            System.out.println("CONTA NÂO LOCALIZADA");
        }

    }

    public void adicionarRedimento(int numeroDaConta){
        Conta c = busca(numeroDaConta);
        if (c != null){
            ((ContaPoupanca) c).rentabilidade();
            System.out.println("RENDIMENTOS ATUALIZADOS :)\n");
        } else {
            System.out.println("CONTA NÂO LOCALIZADA");
        }
    }

    public void cobrancaManutencaoConta(int numeroDaConta) {
        Conta c = busca(numeroDaConta);
        if (c != null){
            ((ContaCorrente) c).ManutencaoConta();
            System.out.println("COBRANÇA REALIZADA");;
        } else {
            System.out.println("CONTA NÂO LOCALIZADA");
        }
    }
}

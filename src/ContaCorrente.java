public class ContaCorrente extends Conta{
    private float tarifa = 5.99f;

    public ContaCorrente(String nomeUsuario, String tipoDaConta) {
        super(nomeUsuario, tipoDaConta);
    }

    public float getTarifa() {
        return tarifa;
    }

    public void ManutencaoConta(){
        if (getSaldo() > getTarifa()){
            setSaldo(getSaldo() - getTarifa());
            System.out.println("=> COBRANÇA REALIZADA, OBRIGADO! <=");
        } else {
            System.out.println("!!! ATENÇÃO: PENDENTE VALOR A SER DEBITADO, REALIZE UM DEPÓSITO!!!");
        }
    }
}

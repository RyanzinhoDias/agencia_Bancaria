//Classe modelo para contas corrente e poupança
public abstract class Conta  implements Operacoes{
    private static int contadorContas = 1;

    private String nomeUsuario;
    private String tipoDaConta;
    private int numeroConta;
    private double saldo = 0.0;


    public Conta(String nomeUsuario, String tipoDaConta) {
        this.nomeUsuario = nomeUsuario;

        this.tipoDaConta = tipoDaConta;
        this.numeroConta = contadorContas;

        contadorContas += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    //Comportamentos
    @Override
    public void deposito(double valorDepositado) {
        if (valorDepositado >= 10) {
            setSaldo(getSaldo() + valorDepositado);
            System.out.println("DEPOSITO REALIZADO COM SUCESSO");
        } else {
            System.out.println("VALOR ABAIXO DO MINIMO PARA DEPOSITO");
        }
    }

    @Override
    public void saldo() {
        String res = String.format("SALDO ATUAL: %.2f", getSaldo());
        System.out.println(res);
    }

    @Override
    public boolean saque(double valorSaque) {
        if (valorSaque <= getSaldo() && valorSaque > 10 ) {
            setSaldo(getSaldo() - valorSaque);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void tranferencia(Conta saida, Conta contaDestino, double valorTransferido){
        if (valorTransferido >= 10.0 && valorTransferido <= saida.getSaldo()){
            saida.setSaldo(saida.getSaldo() - valorTransferido);

            contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferido);

            System.out.println("TRANSFERÊNCIA REALIZADA COM SUCESSO :)");
        } else {
            System.out.println("!!!ATENÇÃO: NÃO FOI POSSÍVEL REALIZAR ESSA TRANSFERÊNCIA!!!\n");
        }
    }

    public void impressao(){
        System.out.print(" Titular: " + this.getNomeUsuario());
        System.out.print(" | Número da Conta: " + this.getNumeroConta());
        System.out.print(" | Tipo da conta: " + this.getTipoDaConta());
        System.out.println(" | Saldo: " + this.getSaldo());
    }
}

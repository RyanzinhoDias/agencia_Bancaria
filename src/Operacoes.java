//Interface usada para representar as operações bancárias
public interface Operacoes {
    public abstract void deposito(double valorDepositado);
    public abstract void saldo();
    public abstract boolean saque(double valorSaque);
    public abstract void tranferencia(Conta saida, Conta contaDestino, double valorTransferido);
}

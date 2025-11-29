public class ContaPoupanca extends Conta{
    private float rendimento = 0.02f;

    public ContaPoupanca(String nomeUsuario, String tipoDaConta) {
        super(nomeUsuario, tipoDaConta);
    }

    public float getRendimento() {
        return rendimento;
    }

    public void rentabilidade(){
        setSaldo(getSaldo() + (getSaldo() * getRendimento()));
    }
}

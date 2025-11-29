import java.util.Scanner;
public class Main {

    public static void menu(){
        System.out.println("        >>>  MENU  <<<\n" +
                "|=> 1 - Criar conta POUPANÇA;" +
                "\n|=> 2 - Criar conta CORRENTE;" +
                "\n|=> 3 - Transferência;" +
                "\n|=> 4 - Exibir saldo;" +
                "\n|=> 5 - Depositar;" +
                "\n|=> 6 - Sacar;" +
                "\n|=> 7 - Aplicar Rendimento;" +
                "\n|=> 8 - Manutenção de conta;" +
                "\n|=> 9 - Finalizar programa.\n");
    }


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Banco meuBanco = new Banco();
        Leitura entradaDados = new Leitura();

        int opcao;
        do {
            menu();
            System.out.print("Digite uma opção: ");
            opcao = entradaDados.lerInteiro();


            String nome;
            int numConta;
            double valor;

            switch (opcao) {
                case 1:
                    System.out.println("#### CRIANDO CONTA POUPANÇA ###");
                    System.out.print("Digite o nome do titular: ");

                    nome = entrada.nextLine();

                    ContaPoupanca minhaPoupanca = new ContaPoupanca(nome, "POUPANCA");
                    System.out.print(" >> CONTA CRIADA COM SUCESSO => ");
                    meuBanco.inserirConta(minhaPoupanca);
                    break;
                case 2:
                    System.out.print("#### CRIANDO CONTA CORRENTE ###");
                    System.out.print("Digite o nome do titular: ");

                    nome = entrada.nextLine();

                    Conta minhaCorrente = new ContaCorrente(nome, "CORRENTE");
                    meuBanco.inserirConta(minhaCorrente);
                    break;
                case 3:
                    System.out.println("### REALIZAR TRANSFERÊNCIA ###");
                    System.out.print("Digite o número da conta da qual irá transferir: ");

                    numConta = entradaDados.lerInteiro();

                    System.out.print("Digite o número da conta que irá receber: ");
                    int contaDestido = entradaDados.lerInteiro();

                    System.out.print("Digite o valor da transferência: ");
                    valor = entradaDados.lerDouble();
                    meuBanco.transferir(numConta, contaDestido, valor);
                    break;
                case 4:
                    System.out.println("### EXIBIR SALDO ###");
                    System.out.print("Digite o número da sua conta:  ");

                    numConta = entradaDados.lerInteiro();
                    meuBanco.exibirSaldo(numConta);
                    break;
                case 5:
                    System.out.println("### DEPOSITAR ###");
                    System.out.print("Digite o número da sua conta:  ");

                    numConta = entradaDados.lerInteiro();

                    System.out.print("Digite o valor que será DEPOSITADO: ");

                    valor = entradaDados.lerDouble();
                    meuBanco.depositar(numConta, valor);
                    break;
                case 6:
                    System.out.println("### SACAR ###");
                    System.out.print("Digite o número da sua conta:  ");
                    numConta = entradaDados.lerInteiro();
                    System.out.print("Digite o valor que será SACADO: ");

                    valor = entradaDados.lerDouble();
                    meuBanco.sacar(numConta, valor);
                    break;
                case 7:
                    System.out.println("### RENDIMENTO ###");
                    System.out.print("Digite o número da sua conta POUPANÇA:  ");

                    numConta = entradaDados.lerInteiro();
                    meuBanco.adicionarRedimento(numConta);
                    break;
                case 8:
                    System.out.println("### MANUTENÇÃO DE CONTA ###");
                    System.out.print("Digite o número da sua conta CORRENTE:  ");

                    numConta = entradaDados.lerInteiro();
                    meuBanco.cobrancaManutencaoConta(numConta);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
            }
        } while (opcao != 9);

        System.out.println("Finalizando programa...");
    }

}
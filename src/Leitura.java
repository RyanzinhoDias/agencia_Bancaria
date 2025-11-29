import java.util.Scanner;

public class Leitura {
    private Scanner entrada = new Scanner(System.in);

    public int lerInteiro() {

        while (!entrada.hasNextInt()) {
            System.out.print("Valor inválido! Digite novamente:");
            entrada.next();
        }

        return entrada.nextInt();
    }

    public double lerDouble() {

        while (!entrada.hasNextDouble()) {
            System.out.print("Valor inválido! Digite novamente:");
            entrada.next();
        }

        return entrada.nextDouble();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int conta = 951753;
        int agencia = 0321;
        String cliente = "Afonso Carvalho";
        double saldo = 1527.0;

        System.out.println("Por favor, digite o número da Agência:");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.next();

        String verificar = "";
        if (agencia == numeroAgencia) {
            verificar = "Numero agencia Ok!";
        }
        if (conta == numeroConta) {
            verificar = "Numero da conta Ok!";
        } else {

        }
    }
}

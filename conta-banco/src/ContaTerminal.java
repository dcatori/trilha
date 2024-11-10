import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String ag = sc.nextLine();
        System.out.print("Por favor, digite o número da Conta: ");
        int ct = sc.nextInt();

        System.out.println();
        System.out.println("Olá,  " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + ag + ", conta " + ct + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Banco");

        Scanner sc = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();
        System.out.println("Por favor, digite o número da Agência!: ");
        conta.setAgencia(sc.nextLine());

        System.out.println("Por favor, digite o numero da conta: ");
        conta.setNumero(Integer.parseInt( sc.nextLine()));

        System.out.println("Por favor, digite o nome do cliente: ");
        conta.setNomeCliente(sc.nextLine());

        System.out.println("Por favor, digite o saldo do cliente: ");
        conta.setSaldo(sc.nextDouble());

        System.out.println("");
        sc.close();
        System.out.println(conta);
    }
}
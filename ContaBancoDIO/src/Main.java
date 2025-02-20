import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o número da conta: ");
        Integer conta = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Insira o número da agência: ");
        String agencia = leitura.nextLine();

        System.out.println("Insira o nome do cliente: ");
        String nomeCliente = leitura.nextLine();

        System.out.println("Insira o saldo: ");
        Double saldo = leitura.nextDouble();

        ContaTerminal contaTerminal = new ContaTerminal(conta, agencia, nomeCliente, saldo);

        System.out.println(contaTerminal);
    }
}

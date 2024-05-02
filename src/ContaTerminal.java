import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Informe sua agência: ");
        String agencia = input.nextLine();

        System.out.println("Informe o número da sua conta: ");
        int conta = input.nextInt();

        System.out.println("Valor do depósito: ");
        double saldo = input.nextDouble();

        String saldoFormatado = String.format("%.2f", saldo);

        System.out.println("\n Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldoFormatado + " já está disponível para saque");
    }
}
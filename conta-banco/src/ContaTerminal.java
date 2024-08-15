import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int numeroConta;
        int agencia;
        String nomeCliente;
        double saldo = 100.00;

        System.out.println("Digite os números da conta");
        numeroConta = scan.nextInt();

        System.out.println("Digite os numeros da agencia");
        agencia = scan.nextInt();

        System.out.println("Digite o nome do cliente");
        nomeCliente = scan.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numeroConta + " e seu saldo " + saldo + " já está disponivel para sague.");

    }
}

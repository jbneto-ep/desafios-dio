import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int conta;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Olá, por favor, digite o número da sua agência: ");
        agencia = scan.next();

        System.out.println("Agora, digite o número da sua conta: ");
        conta = scan.nextInt();

        System.out.println("Qual o seu nome? ");
        nomeCliente = scan.next();

        System.out.println("Agora, digite o valor do saldo para saque: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente);  
        System.out.println("obrigado por criar uma conta em nosso banco, sua agência é " + agencia);
        System.out.println("conta " + conta);
        System.out.println("e seu saldo " + saldo + " já está disponível para saque.");
    }
}


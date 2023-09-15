import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        String sobrenomeCliente;
        double saldo;

        System.out.println("Por favor digite o número da conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Digite o número da agência: ");
        agencia = sc.next();

        System.out.println("Digite seu Primeiro nome: ");
        nomeCliente = sc.next();

        System.out.println("Digite seu sobrenome: ");
        sobrenomeCliente = sc.next();

        System.out.println("Digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por riar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}

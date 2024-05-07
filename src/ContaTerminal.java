import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Declaração de variaveis
        int numero;
        String agencia = "067-8";
        String clienteNome;
        //Criando uma conta o cliente recebe 50 Reais como "Bonus"
        double saldo = 50;
        double adc;
        //Inicializando scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------------------------------------------");
        System.out.println("Bem-vindo ao RS7Bank!! Vamos criar sua conta.");
        System.out.println("---------------------------------------------");
        System.out.println("==============================================");

        System.out.println("Por favor, digite o número da Agência!");
        numero = sc.nextInt();
        // Consumindo a quebra de linha pendente
        sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        clienteNome = sc.nextLine();
        System.out.println("==========================================================");
        System.out.println("Parabéns!! Criando a conta você recebe R$ 50.00 como bônus.\nQuanto deseja adicionar ao saldo?");
        System.out.println("==========================================================");
        adc = sc.nextDouble();
        saldo += adc;

        System.out.println("================================================");
        System.out.println("------------------------------------------------");
        System.out.println("Olá, " + clienteNome + "!\nObrigado por criar uma conta em nosso banco. \nSua agência é " + agencia + ", conta " + numero + ", seu saldo de R$ " + saldo + ", já está disponível para saque");
        System.out.println("------------------------------------------------");
        System.out.println("================================================");

        sc.close();
    }
}

//importando a classe Scanner para ler valores pelo terminal.
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criando uma variável para ler valores pelo terminal utilizando a classe Scanner.
        Scanner scanner = new Scanner(System.in);

        //Solicitando nome e atribuindo o valor a uma variável.
        System.out.println("Digite seu nome:");
        String name = scanner.nextLine();

        //Solicitando agência, convertendo o valor para um número inteiro e atribuindo a uma variável.
        System.out.println("Por favor, digite o número da sua Agência:");
        int AgNum = Integer.parseInt(scanner.nextLine());

        //Solicitando conta e atribuindo o valor a uma variável.
        System.out.println("Por favor, digite o número da sua Conta:");
        String CCNum = scanner.nextLine();

        //Solicitando saldo, convertendo o valor para um número decimal e atribuindo a uma variável.
        System.out.println("Digite o valor do seu saldo:");
        Double balance = Double.parseDouble(scanner.nextLine());

        //Mensagem exibindo todos os dados digitado.
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de R$%s já está disponível para saque.",
                name,
                AgNum,
                CCNum,
                balance);
    }
}
import java.util.Scanner; //Espaço destinado para implementação de bibliotecas

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in); //Método construtor do scanner para inserção de dados 
        
        System.out.println("Olá, vamos fazer o login de sua conta bancária:");

        System.out.println(" Insira o número de seu usuário.");
        int numero = scanner.nextInt();
        System.out.println("\nUsuário: " + numero);
        
        System.out.println("\nPor favor, digite o número de sua agência.");
        String agencia = scanner.next();
        System.out.println("\nAgência: " + agencia);
        
        String nome_cliente = "Gabriel Müller";
        double saldo = 1581.77;
        
        System.out.println("\nOlá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque.");   
    }
}

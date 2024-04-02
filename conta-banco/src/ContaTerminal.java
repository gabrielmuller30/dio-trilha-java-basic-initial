import java.util.Scanner; //Espaço destinado para implementação de bibliotecas
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in); //Método construtor do scanner para inserção de dados 
        scanner.useLocale(Locale.US); //Definindo a localidade para usar o ponto como separador.

        System.out.println("Olá, vamos fazer o login de sua conta bancária.\n");

        System.out.println("Insira o número de seu usuário.");
        int numero = scanner.nextInt();
        System.out.println("Usuário: " + numero);
        
        System.out.println("\nPor favor, digite o número de sua agência.");
        String agencia = scanner.next();//Tem como usar o nextLine(), porém, eu ainda não sei exatamente como usar, apenas que ele capta os dados de uma linha até a quebra de linha.
        System.out.println("Agência: " + agencia);

        System.out.println("\nAgora, insira o seu nome.");
        String nome_cliente = scanner.next();
        System.out.println("Nome: "+ nome_cliente);

        System.out.println("\nInsira o seu saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Saldo: " + saldo);
        

        System.out.println("\nOlá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque.");   
        
        scanner.close();//fechamento do scanner
    }
}

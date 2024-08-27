import java.util.Scanner;
public class ContaTerminal {
	
	public static void main (String[]args) throws Exception{
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu numero: ");
		int numero = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Digite o sua agência: ");
		String agencia = scanner.nextLine();
		
		System.out.println("Digite o seu nome: ");
		String nomeCliente = scanner.nextLine();
		
		System.out.println("Digite o seu saldo: ");
		Double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por comprar em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
		
	}
} 

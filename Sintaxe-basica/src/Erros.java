import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Erros {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Sua altura: ");
		Double altura = scanner.nextDouble();
		scanner.close();
		
		System.out.println(nome + altura);
		}
		catch(InputMismatchException e) {
			System.out.println("Digite seu nome direito ! ");
		}
		
		
	}
}

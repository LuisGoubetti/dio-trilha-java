import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva o nome do banco: ");
		String nomeBanco = scanner.nextLine();
		System.out.println("Escreva a cidade do banco: ");
		String cidade = scanner.nextLine();
		
		Banco banco = new Banco(nomeBanco,cidade);
		
		System.out.println("Qual o seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Qual sua idade: ");
		int idade = scanner.nextInt();
		Cliente cliente = new Cliente(nome,idade);
		scanner.nextLine();
		Conta conta = null;
		while(true) {
		System.out.println("Você deseja conta poupança ou conta corrente? ");
		String opcao = scanner.nextLine();
		if(opcao.equalsIgnoreCase("poupanca")) {
			conta = new ContaPoupanca(cliente);
			banco.adicionarConta(conta);
			break;
		}else if(opcao.equalsIgnoreCase("corrente")) {
			conta = new ContaCorrente(cliente);
			banco.adicionarConta(conta);
			break;
		}else {
			System.out.println("Escolha um tipo válido!");
		}
	}
		if (conta!=null) {
			conta.imprimirExtrato();
		}
		
		banco.imprimirInfosBanco();
		scanner.close();
	}
	
}

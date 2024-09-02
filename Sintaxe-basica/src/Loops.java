
public class Loops {

	public static void main(String[] args) {
		
		// laço for
		
		for (int carneirinhos = 1 ; carneirinhos <= 20; carneirinhos++) {
			System.out.println("Contando carneirinhos: " + carneirinhos);
		}
		
		System.out.println("\n");
		
		// for em arrays
		String alunos[] = {"LUIS" , "FELIPE" , "JOSÉ" , "MARCOS"};
		
		for (int i=0; i<alunos.length; i++) {
			System.out.println("\n" + alunos[i]);
		}
		
		
		//for each
		
		for (String aluno : alunos) {
			System.out.println("Nome do aluno é: " + aluno);
		}
	

		// break, para o codigo dentro das chaves
		System.out.println("\n");
		for (int i = 1; i <=5; i ++) {
			if (i == 3)
			break;
			System.out.println(i);
		}
		
		
		System.out.println("\n");
		//continue, somente continua o laço
		
		for (int i = 0; i<=5; i++) {
			if (i == 3)
				continue; // nao imprime 3 por que a impressão está abaixo

			System.out.println(i);
		}
	
		//while - enquanto
		double mesada = 50.0;
		while(mesada > 0) {
			mesada = mesada - 5;
			System.out.println("\nJoaozinho comprou doce, agora esta com: " + mesada + " reais");
		}
		
		//do while, faça equanto
		int i = 0;
		do {
			System.out.println(" \nolá");
			i++;
		} while(i<1);
		
	
		
	}
}


public class Operadores {

	public static void main(String[] args) {
		String nome = "José";
		int idade = 22;
		double peso = 22.5;
		char sexo = 'M';
		boolean doadorOrgao = false;
//		Date dataNascimento =  new Date(); 
		double soma = 10.5 + 15.0;
		int subtracao = 13-5;
		int mult = 1*5;
		int div = 15/3;
		int modulo = 18%3;
		double resultado = (10*7) + (20/4);
		
		System.out.println(nome + " João");
		
		//Unários
		int numero = 5;
		
		numero = -numero;
		
		System.out.println(numero);
		System.out.println(numero);
		
		int numeroNovo = 5; 
		numeroNovo++; //incrementa ou decrementa um a partir de onde está
		System.out.println(--numeroNovo);
		
		//Ternário
		
		int a = 6;
		int b = 6;
		
		String resultadoT = a==b ? "verdadeiro" : "falso";
		System.out.println(resultadoT);
		//equals compara conteúdos
	}

}

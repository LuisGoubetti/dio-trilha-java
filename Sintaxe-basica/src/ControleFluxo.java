
public class ControleFluxo {

	public static void main(String[] args) {
		double saldo = 25.0;
		double valorSolicitado = 17.0;
		
		//condicional simples
		if (valorSolicitado < saldo)
			saldo = saldo - valorSolicitado;
		
		System.out.println(saldo);
		
		//condicional composta
		System.out.println("\n");

		int nota = 6;
		if (nota>=7)
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");
				
		//condicional encadeada
		System.out.println("\n");

		int nota1 = 6;
		if (nota1 >= 7)
			System.out.println("Aprovado");
		else if (nota1 >= 5 && nota1 < 7)
			System.out.println("Prova de recuperação");
		else 
			System.out.println("Reprovado");
		
		//condicionl ternária
		System.out.println("\n");
				
		int nota2 = 4;
		
		String resultado = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2<7 ? "Recuperação" : "Reprovado";  
		System.out.println(resultado);
		
		//switch case
		String sigla = "M";
		System.out.println("\n");

		switch (sigla) {
		
			case "P":{
				System.out.println("Pequeno");
				break;}
			case "M":{
				System.out.println("Médio");
				break;}
			case "G":{
				System.out.println("Grande");
				break;}
			case "I":{
				System.out.println("Indefinido");
				break;}
			}
		}
		
}	



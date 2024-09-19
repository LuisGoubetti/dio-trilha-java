package com.controle.fluxo;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o parâmetro um: ");
		int parametro1 = scanner.nextInt();
		
		System.out.println("Digite o parâmetro dois: ");
		int parametro2 = scanner.nextInt();
							
		try {
			contar(parametro1,parametro2);
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}
	
	static void contar (int parametro1, int parametro2) throws ParametrosInvalidosException {
		
		int contagem = parametro2 - parametro1;
		
		if (parametro1 > parametro2) 
			throw new ParametrosInvalidosException();
		else {
			for (int i = 0; i < contagem; i++ ) {
				System.out.println("Contagem: " + (i+1));
			}		
		}
		
	}

}

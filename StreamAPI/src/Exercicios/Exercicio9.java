package Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio9 {
	
	public static boolean verificaIguais(List<Integer>lista) {
		return lista.stream()
		.distinct() //remove os elementos duplicados
		.count() == lista.size(); //compara a stream após os elementos duplicados com o tamanho da original, se for true é por que nenhum se repete.
	}
	
	public static void main (String[]args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4);		
		System.out.println("Existe numeros iguais? : " + verificaIguais(numeros));		
	}	
}

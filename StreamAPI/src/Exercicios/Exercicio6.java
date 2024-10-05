package Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio6 {
	
	public static boolean verificaMaiorQueDez(List<Integer>lista) {
		return
		lista.stream()
		.anyMatch( n -> n >=10);	
	}
	
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		System.out.println("Tem número maior que dez? " + verificaMaiorQueDez(numeros));
	}
}

package Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio8 {	
	
	public static int soma(List<Integer> lista) {
		return lista.stream()
		.mapToInt(Integer::intValue) //.mapToInt(n->n)
		.reduce(0,Integer::sum);  //.reduce(0,(n1,n2)->n1+n2);
	}

	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		int somaDosNumeros = soma(numeros);
		System.out.println(somaDosNumeros);
	}
}

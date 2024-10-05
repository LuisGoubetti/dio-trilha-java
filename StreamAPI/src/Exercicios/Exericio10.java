package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exericio10 {
	
	public static List<Integer> verificador(List<Integer> lista){
		return lista.stream()
		.filter( n -> (n % 3 == 0 || n % 5 == 0) &&  n % 2 != 0) //verifica os numeros que são ou multiplos de 3,5 e impares.
		.collect(Collectors.toList());
	}
		
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		System.out.println("Lista dos numeros multiplos de 3 ou 5 e que são impares: " + verificador(numeros));
	}
}

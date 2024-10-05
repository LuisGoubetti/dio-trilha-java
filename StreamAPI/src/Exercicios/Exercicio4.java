package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercicio4 {
	
	public static List<Integer> listaSemImpares(List<Integer>lista, Predicate<Integer>predicate){
		return 
		lista.stream()
		.filter(predicate)
		.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Predicate<Integer> predicate = (n)-> n % 2 == 0; 
		
		lista = listaSemImpares(lista, predicate);
		System.out.println(lista);
		
	}

}

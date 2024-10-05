package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercicio5 {
	
	public static List<Integer> maioresQueCinco(List<Integer>lista) {
		Predicate<Integer> testeMaiorQueCinco = n -> n > 5;
		
		return lista.stream()
		.filter(testeMaiorQueCinco)
		.collect(Collectors.toList());
		
	}
	
		
	public static Double mediaMaioresCinco(List<Integer>lista) {
		return lista.stream()
		.filter(n -> n>5)
		.mapToInt(n -> n)
		.average()
		.orElse(0.0d);
	}
	
	public static void main(String[] args) {
		List<Integer>lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(maioresQueCinco(lista));
		System.out.println(mediaMaioresCinco(lista));
	}
}

package Exercicios;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exercicio2 {
	
	public static Integer somaPares(List<Integer> lista, Predicate<Integer> nPares){
		return 
		lista.stream()
		.filter(nPares)
		.reduce(0,(n1,n2) -> n1 + n2);
	}
	
	
	public static void main(String[] args) {		
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		Predicate<Integer> numerosPares = n -> n % 2 == 0;
		 
		Integer resultado = somaPares(lista,numerosPares);
		System.out.println(resultado);
	}
	
	
}

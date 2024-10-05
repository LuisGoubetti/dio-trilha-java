package Exercicios;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio1 {
	
	public static List<Integer> ordenarLista(List<Integer> lista) {
		return 
		lista.stream()
		.sorted( (n1,n2) -> Integer.compare(n1,n2))
		.collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		List<Integer> numerosOrdenados = ordenarLista(numeros);
		System.out.println(numerosOrdenados);
		
	}
}

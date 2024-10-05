package Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exercicio3 {
	
	public static boolean listaPositivos(List<Integer>lista, Predicate<Integer> testePositivo){
		return lista.stream()
		.allMatch(testePositivo); //testar todos e retornar com base em uma condição!
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(-1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
	    Predicate<Integer> testePositivo = (n) -> n > 0 ;
		System.out.println("Todos são positivos? " + listaPositivos(lista,testePositivo));
		
	}
}

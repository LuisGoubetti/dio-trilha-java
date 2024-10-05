package Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio7 {
	
	public static Integer segundoMaior(List<Integer> lista) {
		return lista.stream()
				.distinct() // Para garantir que não haja duplicatas
                .sorted((n1,n2)-> Integer.compare(n2, n1)) //organiza em ordem descrescente
                .skip(1) //pula o maior
                .findFirst() //pega o primeiro
                .orElse(0); //se não tiver valor retorna 0
		
	}
	
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(segundoMaior(lista));
	}
}

package Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Numero> numerosList; //criando uma List numerosList passando o tipo numero -> Numero
	
	public SomaNumeros() {
		this.numerosList = new ArrayList<>();
	}
	
	public void adicionarNumero(double numero) {
		numerosList.add(new Numero(numero));
	}
	
	public double somarNumeros() {
		double soma = 0.0;
		if(!numerosList.isEmpty()) {
			for (Numero n : numerosList) {
				soma += n.getNumero();
			}
		}
		return soma;
	}
	
	public double encontrarMaiorNumero() {
		
		double maiorNumero = Double.NEGATIVE_INFINITY; //menor valor possivel pois quero o maior
		
		if(!numerosList.isEmpty()) {
			for (Numero n : numerosList) {
				if (n.getNumero() > maiorNumero) {
					maiorNumero = n.getNumero();
				}
			}
		}
			
		return maiorNumero;
	}
	
	public double encontrarMenorNumero() {
		double menorNumero = Double.POSITIVE_INFINITY;
		if(!numerosList.isEmpty()) {
			for (Numero n : numerosList) {
				if (n.getNumero() < menorNumero) {
					menorNumero = n.getNumero();
				}
			}
		}
		
		return menorNumero;
	}
	
	public List<Numero> exibirNumeros() {
		return numerosList;
	}
	
	public static void main (String args[]) {
		SomaNumeros listaNumeros = new SomaNumeros();
		
		listaNumeros.adicionarNumero(5.5);
		listaNumeros.adicionarNumero(6.5);
		System.out.println(listaNumeros.encontrarMaiorNumero());
		System.out.println(listaNumeros.encontrarMenorNumero());
		System.out.println(listaNumeros.somarNumeros());
		System.out.println(listaNumeros.exibirNumeros());
	}
	
}

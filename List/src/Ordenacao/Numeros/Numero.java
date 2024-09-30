package Ordenacao.Numeros;

import java.util.Comparator;

public class Numero implements Comparable <Numero> {
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Numero: " + numero;
	}

	@Override
	public int compareTo(Numero n) {
		// TODO Auto-generated method stub
		return Integer.compare(numero, n.getNumero());
	}
}
class comparatorPorNumeroDecrescente implements Comparator<Numero>{

	@Override
	public int compare(Numero n1, Numero n2) {
		return Integer.compare(n2.getNumero(), n1.getNumero());
	}
	
}
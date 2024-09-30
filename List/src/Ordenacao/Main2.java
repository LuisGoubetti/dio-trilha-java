package Ordenacao;

import Ordenacao.Pessoas.OrdenacaoPessoas;

public class Main2 {

	public static void main(String[] args) {
		
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
		
		ordenacaoPessoas.adicionarPessoas("JOSE", 11, 1.3);
		ordenacaoPessoas.adicionarPessoas("JOSE", 12, 1.2);
		ordenacaoPessoas.adicionarPessoas("JOSE", 13, 1.1);
		
		System.out.println(ordenacaoPessoas.ordenarPorAltura());
		System.out.println(ordenacaoPessoas.ordenarPorIdade());
		
	}

}

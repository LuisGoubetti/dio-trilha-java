package Ordenacao;

import Ordenacao.Pessoas.OrdenacaoPessoas;

public class Main1 {

	public static void main(String[] args) {
		OrdenacaoPessoas ordenacaopessoa = new OrdenacaoPessoas();
		ordenacaopessoa.adicionarPessoas("Pedro", 11, 1.3);
		ordenacaopessoa.adicionarPessoas("João", 12, 1.2);
		ordenacaopessoa.adicionarPessoas("José", 13, 1.1);
		System.out.println(ordenacaopessoa.ordenarPorAltura());
		System.out.println(ordenacaopessoa.ordenarPorIdade());
		
		
	}

}

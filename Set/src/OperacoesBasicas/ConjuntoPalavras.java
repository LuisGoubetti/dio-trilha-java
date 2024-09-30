package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavras {

	private Set<Palavra> palavraSet;
	
	
	public ConjuntoPalavras() {
		this.palavraSet = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		palavraSet.add(new Palavra(palavra));
	}

	public void removerPalavra(String palavra) {
		Palavra palavraRemover = null;
		
		for (Palavra p : palavraSet) {
			if (p.getPalavra() == palavra) {
				palavraRemover = p;
				break;
			}
		}
		palavraSet.remove(palavraRemover);
	}
	
	
	public void verificarPresente(String palavra) {
		Palavra palavraBusca = new Palavra(palavra);
		if (palavraSet.contains(palavraBusca)) {
			System.out.println("Palavra presente no Set");
		}else {
			System.out.println("Palavra não presente no Set");
		}
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(palavraSet);
	}
	
	public static void main(String[] args) {
		ConjuntoPalavras conjunto = new ConjuntoPalavras();
		
		conjunto.adicionarPalavra("Pedro");
		conjunto.adicionarPalavra("João");
		conjunto.adicionarPalavra("Pedro"); // teste para ver se só permite um pedro
		conjunto.exibirPalavrasUnicas();
		
		conjunto.removerPalavra("Pedro");
		conjunto.exibirPalavrasUnicas();

		conjunto.adicionarPalavra("Pedro");
		conjunto.verificarPresente("Pedro");
		conjunto.verificarPresente("Chico");
	}
	
}
		

package OperacoesBasicas.CarrinhoCompras;


public class Item {
		
	String nome;
	Double preco;
	int quantidade;
	
	public Item (String nome, Double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public String toString() {
		return "Nome:" + nome + "| preco: " + preco + "| quantidade: " + quantidade;
	}
	
}

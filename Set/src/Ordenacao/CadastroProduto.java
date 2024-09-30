package Ordenacao;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
	private Set<Produto> produtosSet;

	public CadastroProduto() {
		this.produtosSet = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtosSet.add(new Produto(cod, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
		return produtosPorNome;	
	}
	
	public Set<Produto> exibirPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtosSet);
		return produtosPorPreco;
	}
	
	public static void main(String[] args) {
		CadastroProduto cadastro = new CadastroProduto();
		cadastro.adicionarProduto(5L, "Maça", 1.7, 3);
		cadastro.adicionarProduto(4L, "Produto", 1.5, 5);
		System.out.println(cadastro.exibirProdutosPorNome());
		System.out.println(cadastro.exibirPorPreco());
	}
}

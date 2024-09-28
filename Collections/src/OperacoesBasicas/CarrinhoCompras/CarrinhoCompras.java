package OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	private double resultado = 0.0;
	private List<Item> CarrinhoList;
	
	public CarrinhoCompras() {
		this.CarrinhoList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		CarrinhoList.add(new Item(nome,preco,quantidade));
	}
	
	public void removerItem(String nome){
		List<Item> itenspararemover = new ArrayList<>();
		
		for (Item t : CarrinhoList) {
			if (t.getNome().equalsIgnoreCase(nome));{
				itenspararemover.add(t);
			}
		}
		CarrinhoList.removeAll(itenspararemover);
	}
	
	public double calcularTotal() {
		
		for (Item t : CarrinhoList) {
			double preco = t.getPreco();
			double quantidade = t.getQuantidade();
			resultado += preco * quantidade;
		}
		return resultado;
	}
	
	public void exibirItens() {
		System.out.println(CarrinhoList);
	}
	
	public static void main (String[]args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		carrinho.adicionarItem("banana", 5.0f, 3);
		carrinho.adicionarItem("maça", 5.0f, 3);
		
		System.out.println("O total é: " + carrinho.calcularTotal());
		carrinho.exibirItens();
		

	}
}

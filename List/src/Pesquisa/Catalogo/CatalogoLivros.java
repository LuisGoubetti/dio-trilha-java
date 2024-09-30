package Pesquisa.Catalogo;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	//atributo
	private List<Livro> livrosList;

	public CatalogoLivros() {
		this.livrosList = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int ano) {
		livrosList.add(new Livro(titulo,autor,ano));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		if (!livrosList.isEmpty()) {
			for (Livro l : livrosList) {
				if (l.getAutor().equalsIgnoreCase(autor)){
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervalo = new ArrayList<>();
		
		if (!livrosList.isEmpty()) {
			for (Livro l: livrosList) {
				if (l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<= anoFinal) {
					livrosPorIntervalo.add(l);
				}
			}
		}
		return livrosPorIntervalo;
	}
	
	public Livro pesquisarPorTitulo (String titulo){
		Livro livroPorTitulo = null;
		
		if (!livrosList.isEmpty()) {
			for (Livro l : livrosList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break; //como o exercicio só pede o primeiro livro encontrado, não é necessário continuar
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String args[]) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("Livro1", "Pedro", 2012);
		catalogoLivros.adicionarLivro("Livro2", "João", 2014);
		catalogoLivros.adicionarLivro("Livro3", "João", 2013);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("João"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2013, 2014));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro1"));


	}
}

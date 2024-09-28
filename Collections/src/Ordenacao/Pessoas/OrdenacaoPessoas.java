package Ordenacao.Pessoas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	private List<Pessoa> pessoasList;

	public OrdenacaoPessoas() {
		this.pessoasList = new ArrayList<>();
	}
	
	public void adicionarPessoas(String nome, int idade, double altura) {
		pessoasList.add(new Pessoa(nome,idade,altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		//a lista inicia com todos elementos da list pessoasList
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
		//esse sort sabe que deve ordenar por meio do comparable da classe Pessoa
		Collections.sort(pessoasPorIdade);
		
		return pessoasPorIdade;		
	}

	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
}

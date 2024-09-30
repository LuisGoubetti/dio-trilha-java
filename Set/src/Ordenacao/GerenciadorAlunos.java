package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	private Set<Aluno> alunoSet;

	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, long matricula, double media) {
		alunoSet.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAluno(long matricula) {
		Aluno alunoParaRemover = null;
		
		for(Aluno a : alunoSet) {
			if(a.getMatricula() == matricula) {
				alunoParaRemover = a;
				break;
			}
		}
		
		alunoSet.remove(alunoParaRemover);
	}
	
	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunosPorNome = new TreeSet<Aluno>(alunoSet);
		return alunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorMedia(){
		Set<Aluno> alunosPorMedia = new TreeSet<>(new ComparatorPorMedia());
		alunosPorMedia.addAll(alunoSet);
		return alunosPorMedia;
	}
	
	public void exibirTodos() {
		System.out.println(alunoSet);
	}
	
	public static void main(String[] args) {
		GerenciadorAlunos gerenciador = new GerenciadorAlunos();
		
		gerenciador.adicionarAluno("Luis", 7, 5.7);
		gerenciador.adicionarAluno("Samuel", 6, 5.5);
		gerenciador.adicionarAluno("Pedro", 5, 5.2);
		
		gerenciador.removerAluno(6);
		gerenciador.exibirTodos();
		System.out.println("\n");
		System.out.println(gerenciador.exibirAlunosPorMedia());
		System.out.println(gerenciador.exibirAlunosPorNome());
	}
	
}

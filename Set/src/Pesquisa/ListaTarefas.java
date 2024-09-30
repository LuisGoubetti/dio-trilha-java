package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefas> tarefasSet;
	
	public ListaTarefas() {
		this.tarefasSet = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao, boolean estado) {
		tarefasSet.add(new Tarefas(descricao, estado));
	}
	
	public void removerTarefa(String descricao) {
	    Tarefas tarefaParaRemover = null;
	    if (!tarefasSet.isEmpty()) {
	      for (Tarefas t : tarefasSet) {
	        if (t.getDescricao().equalsIgnoreCase(descricao)) {
	          tarefaParaRemover = t;
	          break;
	        }
	      }
	      tarefasSet.remove(tarefaParaRemover);
	    } else {
	      System.out.println("O conjunto está vazio");
	    }

	    if(tarefaParaRemover == null) {
	      System.out.println("Tarefa não encontrada!");
	    }
	  }
	
	public void exibirTodasTarefas() {
		System.out.println(tarefasSet);
	}
	
	public int contarTotalTarefas() {
		return tarefasSet.size();
	}
	
	public Set<Tarefas> exibirConcluidas(){
		Set<Tarefas> tarefasConcluidas = new HashSet<>();
		
		if (!tarefasSet.isEmpty()) {
			for (Tarefas t : tarefasSet) {
				if (t.isEstado()) {
					tarefasConcluidas.add(t);
				}
			}	
		}else {
			System.out.println("Set vazio!");
		}
		
		if(tarefasConcluidas.isEmpty()) {
			System.out.println("Nenhuma tarefa concluida!");
		}
		
		return tarefasConcluidas;	
	}
	
	public Set<Tarefas> exibirPendentes(){
		Set<Tarefas> tarefasPendentes = new HashSet<>();
		
		if (tarefasSet.isEmpty()) {
			System.out.println("Set vazio");
		}
		
		for (Tarefas t : tarefasSet) {
			if (!t.isEstado()) {
				tarefasPendentes.add(t);
			}
		}
		
		if (tarefasPendentes.isEmpty()) {
			System.out.println("Sem tarefas pendentes");
		}
		return tarefasPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
			for(Tarefas t : tarefasSet) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setEstado(true);
				}
			}
		}
	
	public void marcarTarefaPendente(String descricao) {
		Tarefas tarefaPendente = null;
		
		for (Tarefas t : tarefasSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaPendente = t;
				break;
			}
		}
		
		if(tarefaPendente.isEstado()) {
			tarefaPendente.setEstado(false);
		}
	}
	
	public void limparLista() {
		if (!tarefasSet.isEmpty()) {
			tarefasSet.clear();
		}else {
			System.out.println("A lista ja está vazia");
		}
	}

	public static void main(String[] args) {
		ListaTarefas lista = new ListaTarefas();
		
		lista.adicionarTarefa("Lavar roupa", true);
		lista.adicionarTarefa("Lavar roupe", true);
		lista.adicionarTarefa("Escutar musica", false);
		lista.adicionarTarefa("Escrever", false);

		lista.removerTarefa("Lavar roupe");
		lista.exibirTodasTarefas();
		
		
		System.out.println(lista.contarTotalTarefas() + " tarefas!");
		System.out.println(lista.exibirConcluidas());
		System.out.println(lista.exibirPendentes());
		lista.marcarTarefaPendente("Lavar Roupa");
		lista.marcarTarefaConcluida("Escutar Musica");
		System.out.println(lista.exibirConcluidas());
		System.out.println(lista.exibirPendentes());		
	}
	
}


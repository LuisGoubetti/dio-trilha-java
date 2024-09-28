package OperacoesBasicas.Tarefas;

public class Tarefa {
	
	//atributo 
	private String descricao;
	
	public Tarefa (String Descricao) {
		this.descricao = Descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
}

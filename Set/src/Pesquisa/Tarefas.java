package Pesquisa;

import java.util.Objects;

public class Tarefas {
	private String descricao;
	private boolean estado;
	
	
	public Tarefas(String descricao, boolean estado) {
		this.descricao = descricao;
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefas other = (Tarefas) obj;
		return Objects.equals(descricao, other.descricao);
	}

	@Override
	public String toString() {
		return " descricao=" + descricao + " Estado=" + estado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}

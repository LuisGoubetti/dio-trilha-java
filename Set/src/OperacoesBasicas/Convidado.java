package OperacoesBasicas;

import java.util.Objects;

public class Convidado {
	private String nome;
	private String codConvite;
	
	public Convidado(String nome, String codConvite) {
		this.nome = nome;
		this.codConvite = codConvite;
	}

	public String getNome() {
		return nome;
	}

	public String getCodConvite() {
		return codConvite;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(codConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return Objects.equals(codConvite, other.codConvite);
	}

	public String toString() {
		return "Nome:" + nome + ", Codigo de convite=" + codConvite;
	}
	
	
	
}

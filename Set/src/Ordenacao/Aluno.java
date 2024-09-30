package Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private long matricula;
	private double media;
	
	public Aluno(String nome, long matricula, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}

	@Override
	public String toString() {
		return "ALUNO nome=" + nome + ", matricula=" + matricula + ", media=" + media;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}

	public long getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}
	
	public double getMedia() {
		return media;
	}

	@Override
	public int compareTo(Aluno o) {
		return nome.compareToIgnoreCase(o.getNome());
	}
}

class ComparatorPorMedia implements Comparator<Aluno>{
	@Override
	public int compare(Aluno a1, Aluno a2) {
		return Double.compare(a1.getMedia(), a2.getMedia());
	}
}
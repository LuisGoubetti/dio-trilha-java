package OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	//atributo
	private Set<Convidado> convidadoSet;
	
	
	//construtor do hashset
	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	public void adicionarConvidado(String nome, String codConvite) {
		convidadoSet.add(new Convidado(nome, codConvite));
	}
	
	public void removerPorCodigo(String codConvite) {
		Convidado convidadoRemover = null;
		
		for (Convidado c : convidadoSet) {
			if (c.getCodConvite() == codConvite){
				convidadoRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoRemover);
	}

	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		conjuntoConvidados.adicionarConvidado("Luis","10f");
		conjuntoConvidados.adicionarConvidado("Pedro","12f");
		conjuntoConvidados.adicionarConvidado("Guilherme","12f");
		conjuntoConvidados.removerPorCodigo("11f");

		System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidados");
		
		conjuntoConvidados.exibirConvidados();
		
	}
	
	
}

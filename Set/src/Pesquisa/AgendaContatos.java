package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContato() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		
		for (Contato c : contatoSet) {
			if (c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		
		for (Contato c : contatoSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.adicionarContato("Maria", 2131);
		agenda.adicionarContato("Maria silva", 2131);
		agenda.adicionarContato("Pedro", 2131);
		agenda.exibirContato();
		System.out.println(agenda.pesquisarNome("Maria"));
		System.err.println(agenda.atualizarNumeroContato("maria", 1111));
		agenda.exibirContato();
	}
}

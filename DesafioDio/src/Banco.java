import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private String cidade;
	private List<Conta> contasRegistrados = new ArrayList<Conta>();
	
	public Banco(String nome, String cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}

	public void adicionarConta(Conta conta) {
		this.contasRegistrados.add(conta);
	}
	
	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}
	
	protected void imprimirInfosBanco() {
		System.out.println(String.format("---Banco %s aberto na cidade de %s---",this.nome,this.cidade));
		System.out.println("Clientes: " + contasRegistrados);
	}
	
}

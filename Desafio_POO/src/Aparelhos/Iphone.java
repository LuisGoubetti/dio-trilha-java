package Aparelhos;

public class Iphone implements AparelhoTelefonico,NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Musica tocando...");
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");
		
	}

	@Override
	public void SelecionarMusica(String musica) {
		System.out.println("Tocando musica: " + musica);
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");	
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo...");	
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");	
	}

}

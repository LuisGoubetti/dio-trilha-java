package Pilares;

public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem(); //todos os objetos precisam realizar essas operações
	public abstract void receberMensagem();
	
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
}

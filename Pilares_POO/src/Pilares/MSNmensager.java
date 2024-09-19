package Pilares;

public class MSNmensager extends ServicoMensagemInstantanea {

	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Msn enviando mensagem");		
	}

	
	public void receberMensagem() {		
		System.out.println("Msn recebendo mensagem\n");	
	}
	
	
}

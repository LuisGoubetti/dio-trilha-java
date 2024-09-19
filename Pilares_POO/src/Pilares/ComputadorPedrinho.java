package Pilares;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		String appEscolhido = "fbm";
		
		if (appEscolhido.equals("msn")) {
			smi = new MSNmensager();
		}else if (appEscolhido.equals("fbm")) {
			smi = new FacebookMensager();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();

	}

}

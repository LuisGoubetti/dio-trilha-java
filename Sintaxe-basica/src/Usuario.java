/**
 * Classe usuário.
 *
 * @author Luis
 * @version 1.0
 * @since 26/08
 */

public class Usuario {
	
	/**
	 * teste
	 * @author luisGoubetti
	 * @param nenhum
	 */

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV ligada? " + smartTv.ligada);
		System.out.println("Canal atual? " + smartTv.canal);
		System.out.println("Volume atual? " + smartTv.volume);
		
		smartTv.ligar ();
		System.out.println("\nNovo status -> TV ligada? " + smartTv.ligada);

		smartTv.mudarCanal(13);
		System.out.println("Novo status -> Canal atual? " + smartTv.canal);
		
		smartTv.aumentarVolume();
		System.out.println("Novo status -> Volume atual? " + smartTv.volume);	
	}
}
 
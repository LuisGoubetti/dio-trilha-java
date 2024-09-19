
public class Carro extends Veiculo {
	
	public void ligar(){
		confereCombustivel();
		confereCambio();
		System.out.println("Foi ligado o carro\n");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combuistivel");
	}
	
	private void confereCambio() {
		System.out.println("Conferindo o cambio");
	}
	
}

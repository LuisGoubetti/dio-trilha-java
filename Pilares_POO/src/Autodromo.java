
public class Autodromo {
	 public static void main(String []args) {
		 
		Carro jeep = new Carro(); //objeto criado a partir da classe carro
		jeep.setChassi("3124");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("12");
		z400.ligar();
		
		Veiculo coringa = z400;
		
		coringa.ligar();
		
		
	}
}

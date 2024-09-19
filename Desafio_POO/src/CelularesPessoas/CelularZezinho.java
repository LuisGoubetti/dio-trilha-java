package CelularesPessoas;
import java.util.Scanner;

import Aparelhos.Iphone;

public class CelularZezinho {

	public static void main(String[] args) {
		String musica, url, numero;
		Iphone celular1 = new Iphone();
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Reprodutor musical funções:\n ");
		celular1.tocar();
		celular1.pausar();
		System.out.println("Digite a musica que quer buscar: ");
		musica = scanner.nextLine();
		celular1.SelecionarMusica(musica);
		
		System.out.println("\nNavegador funções:\n ");
		celular1.adicionarNovaAba();
		celular1.atualizarPagina();
		System.out.println("Digite a pagina que quer buscar: ");
		url = scanner.nextLine();
		celular1.exibirPagina(url);
		
		System.out.println("\nTelefone funções:\n ");
		celular1.atender();
		celular1.iniciarCorreioVoz();
		System.out.println("Digite o numero que quer ligar: ");
		numero = scanner.nextLine();
		celular1.ligar(numero);
	}

}

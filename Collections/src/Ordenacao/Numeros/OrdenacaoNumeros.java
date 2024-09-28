package Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Numero> numerosList;

	public OrdenacaoNumeros() {
		this.numerosList = new ArrayList<Numero>();
	}
	
	public void adicionarNumeros (int numero) {
		numerosList.add(new Numero(numero));
	}
	
	public List<Numero> ordenarAscendente(){
		List<Numero> ascendenteList = new ArrayList<Numero>(numerosList);
		Collections.sort(ascendenteList);
		return ascendenteList;
	}
	
	public List<Numero> ordenarDecrescente(){
		List<Numero> decrescenteList = new ArrayList<Numero>(numerosList);
		Collections.sort(decrescenteList, new comparatorPorNumeroDecrescente());;
		return decrescenteList;
	}
	
	
}

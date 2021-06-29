package vetores;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
	
		ArrayList listaNotas = new ArrayList();
		listaNotas.add(10.0);
		listaNotas.add(7.0);
		listaNotas.add(3.0);
		
		double soma = 0;
		for(Object nota : listaNotas) {
			soma =+ (Double)nota;
		}
	}
}

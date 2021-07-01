package vetores;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
	
		
		ArrayList<Double> listaNotas = new ArrayList<Double>();
		listaNotas.add(10.0);
		listaNotas.add(7.0);
		listaNotas.add(3.0);
		
		ArrayList listaNotasSegundoSemestre = new ArrayList();
		listaNotas.add(1.0);
		listaNotas.add(8.0);
		listaNotas.add(5.0);
		
		listaNotasSegundoSemestre.addAll(listaNotas);
		
		System.out.println(listaNotasSegundoSemestre.toString());

		System.out.println(listaNotasSegundoSemestre.indexOf(1.0));

	}
}

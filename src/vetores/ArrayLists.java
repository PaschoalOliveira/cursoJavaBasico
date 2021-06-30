package vetores;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		Boletim boletim = new Boletim();
		
		boletim.listaNotas.add(7.0);
		
		ArrayList listaNotas = new ArrayList();
		
		listaNotas.add(10.0);
		listaNotas.add(7.0);
		listaNotas.add(3.0);
		listaNotas.add(8.0);
		
		System.out.println(listaNotas.remove(7.0));
		
		ArrayList listaNotasSegundoSemestre = new ArrayList();
		listaNotas.add(1.0);
		listaNotas.add(8.0);
		listaNotas.add(5.0);
		
		listaNotasSegundoSemestre.addAll(listaNotas);
		
		System.out.println(listaNotasSegundoSemestre.toString());

		System.out.println(listaNotasSegundoSemestre.indexOf(1.0));

	}
}

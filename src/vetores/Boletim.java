package vetores;

import java.util.ArrayList;

public class Boletim {

	ArrayList<Double> listaNotas = new ArrayList<Double>();
	
	public void calculaMedia() {

		Double total = 0.0;
		for(Double nota : this.listaNotas) {
			total = total + listaNotas.get(0);
		}
		
	}

}

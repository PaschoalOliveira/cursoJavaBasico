package vetores;

import java.util.*;

public class HashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		java.util.HashMap<String,String> dicionario = new java.util.HashMap<String,String>();
		
		dicionario.put("Java", "linguagem");
		dicionario.put("C++", "linguagem");
		System.out.println(dicionario.toString());
		
		
		dicionario.put("Java", "Ilha");
		
		System.out.println(dicionario.toString());
		
		//Dicionário com código do aluno e média
		//Paschoal = código = 1
		//Fernando = 2
		java.util.HashMap<String,Double> notas = new java.util.HashMap<String,Double>();
		
		notas.put("Paschoal", 9.0);
		notas.put("Fernando", 8.7);
		notas.put("Lucas", 7.5);
		
		notas.put("Lucas", 8.5);
		
		//System.out.println(nota);			

		for(String chave : notas.keySet()) {
			Double nota = notas.get("Lucas");
		}
		
	}
}

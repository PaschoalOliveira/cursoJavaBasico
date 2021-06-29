package loops;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Alberto");
		nomes.add("Fernando");
		nomes.add("Juliano");
		nomes.add("Tobias");
		
		java.util.Iterator<String> nomesIterator = nomes.iterator();
		while(nomesIterator.hasNext()) {
			System.out.println(nomesIterator.next());
		}
		
		for(java.util.Iterator<String> nomesIterator2 = nomes.iterator(); nomesIterator2.hasNext(); ) {
			System.out.println(nomesIterator2.next());
		}
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
	}
}

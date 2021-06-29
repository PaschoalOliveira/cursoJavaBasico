package vetores;

import java.util.*;

public class HashMap {

	public static void main(String[] args) {
	
		java.util.HashMap<String,String> dicionario = new java.util.HashMap<String,String>();
		
		dicionario.put("Java", "linguagem");
		System.out.println(dicionario.toString());
		
		dicionario.put("Java", "Ilha");
		
		System.out.println(dicionario.keySet());
		
	}
}

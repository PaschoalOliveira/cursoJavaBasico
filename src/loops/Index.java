package loops;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = scan.nextLine();
		
		String[] arrayCaracteres = nome.split("");
				
		for(int x =0;  x < nome.length(); x++) {
			System.out.println(nome.charAt(x));
		}
		int i = 10;
		String nome2 = "Rafael";
		
		while(i < 11 || nome2.equals("Rafael") ) {
			
		}
		
	}
}

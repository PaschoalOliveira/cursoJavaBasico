package main.ola;

import java.util.Scanner;

public class IndexCondicional {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		
		String sIdade = scanner.nextLine();
		
		Integer idade = sIdade == "" ? 0 : Integer.valueOf(sIdade);
		
		System.out.println("Qual a sua nome?");
		String sNome = scanner.nextLine();
		
		String sFernando = new String();
		sFernando = "Fernando";
		
		if(idade > 18 && sNome.equals(sFernando)) {
			System.out.println("Bem vindo Fernando");
		}else {
			System.out.println("Bem vindo outra pessoa");			
		}
		
		//System.out.println("Bem vindo Novamente");
		
		/*
		switch(idade) {
			case 18:
				System.out.println("Bem vindo 18 anos");
				break;
			case 19:
				System.out.println("Bem vindo 19 anos");
				break;
			default:
				System.out.println("Bem vindo");
		}
		*/	
	}
}

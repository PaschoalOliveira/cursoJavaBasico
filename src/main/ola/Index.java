package main.ola;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o seu nome e sobrenome?");
		String nomeCompleto = scanner.nextLine();
		String[] nomes = nomeCompleto.split(",");
		
		System.out.println("Qual a sua idade?");
		Integer idade = Integer.valueOf(scanner.nextLine());

		System.out.println("Qual a idadede sua mãe?");
		Integer idadeMae = Integer.valueOf(scanner.nextLine());
		
		//Integer iConjuntoIdades = (idade + idadeMae);
		String conjuntoIdades = idade.toString() + " " + idadeMae.toString();
		
		System.out.println(conjuntoIdades);
		
		System.out.println("Qual o seu sexo?");
		String sexo = scanner.nextLine();
		Character cSexo = sexo.charAt(0);
		
		System.out.println("Você Mora no Brasil");
		Boolean moraBrasil = Boolean.valueOf(scanner.nextLine());
		
		System.out.println("Bem vindo \n" + nomeCompleto + "\n" + idade + "\n" + cSexo);

	}
}

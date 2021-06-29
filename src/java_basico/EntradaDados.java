package java_basico;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Qual o seu Nome?");
		String nome = scan.nextLine();
		
		/*
		System.out.println("Seja bem vindo:" + nome);
		Produto produto = new Produto("Venda", 10,2);
		produto.nome();
		*/
	}
}

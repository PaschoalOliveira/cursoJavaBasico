package condicionais;

import java.util.Scanner;

public class Switcher {

	enum DIA_DA_SEMANA { SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SAVADO, DOMINGO};
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o dia da semana: ");
		String diaDaSemana = scan.nextLine();
		
		System.out.println(verificaDiaSemana3(10, diaDaSemana));
	}
	
	private static Integer verificaDiaSemana(Integer valor, String diaDaSemana) {
		
		switch(diaDaSemana.toUpperCase()) {
		
			case "SEGUNDA":
				valor = valor * 2;
			case "TERCA":
				valor = valor * 4;
			case "QUARTA":
				valor = valor * 6;
			case "QUINTA":
				valor = valor * 8;
			case "SEXTA":
				valor = valor * 10;
			case "SABADO":
				valor = valor * 12;
			case "DOMINGO":
				valor = valor * 14;
			default:
				return valor;
		}	
	}
	
	private static Integer verificaDiaSemana2(Integer valor, String diaDaSemana) {
		
		switch(diaDaSemana.toUpperCase()) {
		
			case "SEGUNDA":
				valor = valor * 2;
				break;
			case "TERCA":
				valor = valor * 4;
				break;
			case "QUARTA":
				valor = valor * 6;
				break;
			case "QUINTA":
				valor = valor * 8;
				break;
			case "SEXTA":
				valor = valor * 10;
				break;
			case "SABADO":
				valor = valor * 12;
				break;
			case "DOMINGO":
				valor = valor * 14;
				break;
			default:
				return valor;
		}	
		return valor;
	}
	
private static Integer verificaDiaSemana3(Integer valor, String diaDaSemana) {
		
		//Expressao Switch
	 	return switch(diaDaSemana.toUpperCase()) {
			case "SEGUNDA" -> valor * 2;
			case "TERCA" ->  valor * 4;
			case "QUARTA" -> valor * 6;
			case "QUINTA" -> valor * 8;
			case "SEXTA" -> valor * 10;
			case "SABADO" -> valor * 12;
			case "DOMINGO" -> valor * 14;
			default -> valor;
		};	
	}
}
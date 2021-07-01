package models;

import java.util.ArrayList;

import models.Aluno;

public class IndexDesconto {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Double media = aluno.calcularMedia();
		
		ArrayList<Aluno> alunosEspeciais = new ArrayList<Aluno>();
		
		for(Aluno alunoEspecial : alunosEspeciais) {
			media = media + alunoEspecial.calcularMedia(0.3);
		}
		
		if(media > 8.0) {
			System.out.println("Desconto concedido!");
		}
	}
}

package models;

import java.util.ArrayList;

import models.Aluno;

public class IndexCalculoMediaEscola {

	public static void main(String[] args) {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		ArrayList<Aluno> alunosEspeciais = new ArrayList<Aluno>();
		
		Double mediaEscola = 0.0;
		
		for(Aluno aluno : alunos) {
			mediaEscola = mediaEscola + aluno.calcularMedia();
		}
		
		for(Aluno alunoEspecial : alunosEspeciais) {
			mediaEscola = mediaEscola + alunoEspecial.calcularMedia(0.5);
		}
		System.out.println(mediaEscola);
	}
}

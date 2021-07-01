package models;

import models.Aluno;
import models.Escola;

public class Index {

	public static void main(String[] args) {
		
		System.out.println();
		
		Aluno aluno = new Aluno();
		
		Aluno aluno2 = new Aluno("Paschoal",80143213123L);

		System.out.println(aluno2.toString());
		
		Escola escola1 = new Escola();
		escola1.setNome("Escola tiradentes");
		
		Escola escola2 = new Escola();
		escola2.setNome("Escola Getulio");
		
		Escola escola3 = new Escola();
		escola3.setNome("ESCOLA FERNANDES");
		
		Escola escola4 = new Escola();
		escola4.setNome("Escola Alcemir");

		System.out.println(escola4);
		
		for(Aluno alunoEscola : escola4.getAlunos()) {
			System.out.println(alunoEscola);
		}
		System.out.println();
		//Aluno aluno1 = new Aluno("Rafael",8013L);
		//Aluno aluno5 = new Aluno("Rafael");
		
		//aluno1.calcularMedia();
		
		/*
		Professor professor = new Professor();
		professor.nome = "Aristoteles";
		professor.materias.add("JAVA");
		
		Professor professor2 = new Professor();
		professor.nome = "Pedro";
		professor.materias.add("C++");
		*/
		
	}
}

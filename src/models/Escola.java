package models;

import java.util.ArrayList;

public class Escola {

	private String nome;
	
	private ArrayList<Aluno> alunos;

	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome + " /BA";
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

		
}

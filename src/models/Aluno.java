package models;

import java.util.ArrayList;

public class Aluno {

	public String nome;
	public Long matricula;
	public ArrayList<Double> notas = new ArrayList<Double>();

	public Aluno() {
		
	}
	
	public Aluno(String nomeParametro) {
		this.nome = nomeParametro;
	}
	
	public Aluno(String nomeParametro, Long matriculaParametro) {
		this.nome = nomeParametro;
		this.matricula = matriculaParametro;
	}
	
	public String toString() {	
		String stringRetorno = nome + " " + matricula;
		return stringRetorno;
	}
	
	
	public void estudar() {
		
	}
	
	public Double calcularMedia() {
		Double media = 0.0;
		for(Double nota : notas) {
			media = media +nota;
		}
		media = media / notas.size();
		return media;
	}
	
	public Double calcularMedia(Double acrescimo) {
		Double media = 0.0;
		for(Double nota : notas) {
			media = media +nota;
		}
		media = media / notas.size();
		media = media + acrescimo;
		return media;
	}
	
}

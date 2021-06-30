package vetores;

public class Matrizes {

	public static void main(String[] args) {
		
		//Linhas - Matematica e Portugues
		//Colunas - Meses 1,2 e 3
		double[] notasMatematica = new double[3];
		notasMatematica[0] = 8.2;
		notasMatematica[1] = 7.5;
		notasMatematica[2] = 6.3;

		double[] notasPortugues = new double[3];
		notasPortugues[0] = 5.4;
		notasPortugues[1] = 4.3;
		notasPortugues[2] = 6.1;

		
		double[][] notas = new double[2][3];
		notas[0][0] = 8.2;
		notas[0][1] = 7.5;
		notas[0][2] = 6.3;
		
		notas[1][0] = 5.4;
		notas[1][1] = 4.3;
		notas[1][2] = 6.1;
		
		for(double[] notaMateria : notas) {
			for(double nota : notaMateria) {
				System.out.println(nota);
			}
		}
	}
}

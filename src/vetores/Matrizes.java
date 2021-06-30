package vetores;

public class Matrizes {

	public static void main(String[] args) {
		
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

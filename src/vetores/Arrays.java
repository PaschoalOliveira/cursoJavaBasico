package vetores;

public class Arrays {

	public static void main(String[] args) {
		
		double[] valores = new double[3];
		valores[0] = 5.0;
		valores[1] = 4.0;
		valores[2] = 3.0;
		
		for(int x =0; x < valores.length; x ++) {
			System.out.println(valores[x]);
		}
		double[] valores2 = {5.0, 4.2, 1.3};
		
		double total = 0;
		for(double valor : valores2) {
			total+=valor;
		}
		System.out.println(total);	
		
	}
}

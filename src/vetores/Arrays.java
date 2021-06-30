package vetores;

public class Arrays {

	public static void main(String[] args) {
		
		//array
		String[] arrayString = new String[10];
		
		double[] valores = new double[3];
		valores[0] = 5.5;
		valores[1] = 4.3;
		valores[2] = 3.2;
		
		for(int x =0; x < valores.length; x ++) {
			System.out.println(valores[x]);
		}
		String[] nomes2 = {"Paschoal","Fernando"};
		
		double[] valores2 = {5.0, 4.2, 1.3};
		
		double total = 0;
			
		for(double valor : valores2) {
			if(valor == 5.0) {
				System.out.println("Achou");
			}
			total = total + valor;
		}
		
		System.out.println(total);	
		
	}
}

package referencia.valor;

import referencia.valor.WraperClass;

public class TesteWrapper3 {

	public static void main(String[] args) {
		WraperClass wrapper = new WraperClass();
		wrapper.variavelClasse = 2;
		
		WraperClass wrapper2 = wrapper;
		wrapper2.variavelClasse = 3;
		
		System.out.println(wrapper.variavelClasse);

	}
}

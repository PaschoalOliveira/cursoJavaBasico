package referencia.valor;

public class TesteWrapper {

	public static void main(String[] args) {
		
		WraperClass wrapper = new WraperClass();
		
		wrapper.variavelClasse = 2;
		
		//wrapper.modificaVariavel(wrapper);
			
		wrapper.modificaVariavelInteger(wrapper.variavelClasse);
		
		System.out.println(wrapper.variavelClasse);

	}
}

package java_basico;

public class BoxingUnboxing {

	public static void main(String[] args) {
		
		int i = 5;
		//Deprecated
		//Integer ii = new Integer(6);
		Integer ii = Integer.valueOf(6);
		
		//Autoboxing
		Integer idade = 10;
		
		//Casting
		Object nota = 0.0;
		String sIdade = (String)nota;
	}
}

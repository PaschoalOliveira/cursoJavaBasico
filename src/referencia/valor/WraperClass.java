package referencia.valor;

public class WraperClass {
	
	Integer variavelClasse;
	
	public static void modificaVariavel(WraperClass w) {	
		w.variavelClasse = 1;
	}
	
	public static void modificaVariavelInteger(Integer i) {	
		i = 1;
	}
	
	public static void modificaNomeIdade(Pessoa pessoa) {	
		pessoa.idade = 10;
		pessoa.nome = "Juliano";
	}
	
	public static void modificaNomeIdade2(int idade, String nome) {	
		idade = 10;
		nome = "Juliano";
	}
}

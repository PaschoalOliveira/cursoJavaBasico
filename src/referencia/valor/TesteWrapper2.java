package referencia.valor;

import referencia.valor.WraperClass;

public class TesteWrapper2 {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.idade = 32;
		pessoa.nome = "Fernando";
		
		WraperClass.modificaNomeIdade2(pessoa.idade,pessoa.nome);
		//WraperClass.modificaNomeIdade(pessoa);
		
		//System.out.println(pessoa.nome + " tem " + pessoa.idade + " anos");
		
	}
}

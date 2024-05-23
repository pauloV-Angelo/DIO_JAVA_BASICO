package application;

public class MinhaClasse {

	public static void main(String[] args) {

		/*
		 * como convenção todas as palavras do nome de uma classe devem começar com
		 * letras maiúsculas
		 */

		/*
		 * Constantes são escritas com todas as suas letras maiúsculas
		 */

		/*
		 * para palavras compostas nos nomes de métodos e variáveis utiliza-se o padrão
		 * camelCase
		 */

		/*
		 * Métodos possuem nome objetivo e verbos no infinitivo
		 */
		String meuNome = "Paulo";
		int anoNascimento = 1996;
		boolean verdadeira = true;
		anoNascimento = 2000;

		int teste = somar(2, 5);
		System.out.println(teste);

		String nome = "Paulo";
		String sobrenome = "Angelo";
		System.out.println(nomeCompleto(nome, sobrenome));
	}

	public static int somar(int a, int b) {
		return a + b;
	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
	}

}

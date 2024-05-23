package application;

public class Operadores {

	public static void main(String[] args) {
		// Operador de atribuição "="
		int valor1 = 10;
		double valor2 = 10.5;
		String teste = "Testando";

		// Operadores aritmédicos
		double soma = 10 + 5;
		double subtracao = 10 - 5;
		double multiplicacao = 10 * 5;
		double divisao = 10 / 5;
		double modulo = 10 % 3;

		// O simbolo de + também pode ser utilizado para concatenação de Strings
		String n1 = "Linguagem";
		String n2 = "JAVA";
		String resultado = n1 + " " + n2; // Linguagem JAVA

		/*
		 * Obs: o operador + dentro do contexto de Strings + tipos numericos vai encarar
		 * a operação como concatenação a partir do momento em que encontrar uma String
		 */

		System.out.println(1 + 1 + 1 + "1"); // = 31 porque primeiro soma os inteiros e dps concatena
		System.out.println("1" + 1 + 1 + 1); // =1111 como concatenou antes de realizar qualquer soma, vai continuar
												// concatenando até o final

		// Operadores unários
		// +(positivo) -(negativo) ++(incremento) --(decremento) !(negação)
		System.out.println("----------------------------------------------");
		int numero = -5;
		System.out.println(-numero);
		numero++;
		System.out.println(numero);
		boolean booleana = true;
		System.out.println(!booleana);

		/*
		 * operador ternario é usado para retornar um valor a partir de uma condição NÃO
		 * para executar comandos. Segue a forma de utilizá-lo: **condição ? se for
		 * verdadeiro retorna isso : se for falso retorna isso**
		 */
		int a = 10;
		int b = 4;
		System.out.println((a > b) ? "essa expressão é verdadeira" : "essa expressão é falsa");

		//Operadores Relacionais
		// ==(igual a) !=(diferente de) > (maior que) < (menor que) >=(maior ou igual a) <=(menor ou igual a)

		System.out.println("----------------------------------------------");
		int num1 = 1;
		int num2 = 2;
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);

		// é possivel comparar objetos também utilizando o método .equals()
		System.out.println("----------------------------------------------");
		String nome1 = "Paulo";
		String nome2 = new String("Paulo");
		/*
		 * acima foram criados dois objetos na memória e quando usamos os operadores
		 * relacionais comuns, eles vão comparar os valores da memória e não seus
		 * conteúdos, por isso para comparar seus conteúdos utilizamos:
		 */
		System.out.println(nome1.equals(nome2));
	
		//Operadores Lógicos
		// && (e) || (ou)
	}
	

}

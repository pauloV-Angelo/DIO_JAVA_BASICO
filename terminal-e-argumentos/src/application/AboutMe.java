package application;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		// os argumentos começam com indice 0
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite seu sobrenome: ");
		String sobrenome =sc.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite sua idade: ");
		double altura = sc.nextDouble();

		System.out.println("Ola, me chamo " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " anos ");
		System.out.println("Minha altura é " + altura + "cm ");
		
		sc.close();
	}

}

package edu.paulo.primeirasemana;

public class BoletimEstudantil {

	public static void main(String[] args) {
		/* arquivo para demonstrar a importância da indentação e
		a organização dos packages
		*/
		int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}

}

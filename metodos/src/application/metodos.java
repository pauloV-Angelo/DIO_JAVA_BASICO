package application;

import entities.SmartTV;

public class metodos {
	public static void main(String[] args) {
/*
 * os nomes de métodos devem ser claros sobre o que fazem,
 * seguir o padrão camelCase e utilizar de verbos
 */
		
		SmartTV smartTV = new SmartTV(false, 10, 20);
		
		System.out.println("Estado da TV: " + smartTV.isLigada());
		
		smartTV.desligar();
		
		smartTV.aumentarVolume();
		
		smartTV.ligar();
		
		smartTV.mudarCanal(70);
		smartTV.mudarCanal(-1);
		
		
	}
}

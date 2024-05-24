package application;

public class escopo {
//	esta variável é visível e válida em toda a classe
	int val1 = 10;

	public static void main(String[] args) {
		//esta variável é visível apenas no escopo do método main
		int val2 = 5;

		// a variável i apenas é visível dentro do fluxo do for
		for(int i = 0;i<10;i++) {
			System.out.println(val2);
			val2++;
		}
	}

}

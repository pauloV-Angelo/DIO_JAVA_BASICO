import java.util.Locale;

public class While {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double mesada = 50.0;
		int x = 0;
		while (mesada > 0) {
			double valorDoce = valorAleatorio();
			if (mesada >= valorDoce) {
				x++;
				mesada = mesada - valorDoce;
				System.out.printf(x + " doces comprados, valor do doce comprado agora: %.2f%n", valorDoce);
				System.out.printf("minha mesada atual: %.2f%n", mesada);
				System.out.println("--------------------");
			} else {
				System.out.printf("Ops, doce caro demais, valor do doce: %.2f%n", valorDoce);
				mesada = 0;
			}
		}
		System.out.println("Consegui comprar " + x + " doces");
	}

	static public double valorAleatorio() {
		return Math.random() * 10 + 1;
	}

}

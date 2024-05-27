import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a medida do produto?(P/M/G) ");
		char sigla = sc.next().charAt(0);

		switch (sigla) {
		case 'P':
			System.out.println("Pequeno");
			break;
		case 'M':
			System.out.println("Médio");
			break;
		case 'G':
			System.out.println("Grande");
			break;
		default:
			System.out.println("sigla incompatível");
		}
		
		sc.close();

	}

}

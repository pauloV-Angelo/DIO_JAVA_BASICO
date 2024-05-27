import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double saldo = 1000;

		System.out.println("Quanto você quer retirar? ");
		double saque = sc.nextDouble();

		if (saque <= saldo) {
			System.out.println("Saque concluido");
			saldo = saldo - saque;
			System.out.printf("Novo saldo = %.2f%n", saldo);
		} else {
			System.out.println("Saldo insuficiente");
			System.out.printf("Saldo atual = %.2f%n", saldo);
		}
		
		System.out.println("Teste %n");
		sc.close();
	}

}

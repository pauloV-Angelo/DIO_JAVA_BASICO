import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		method2();
		System.out.println("End of Program");
	}
	
	public static void method2() {
		System.out.println("***Method 2 start***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: Índice fora do limite do array. ");

		} catch (InputMismatchException e) {
			System.out.println("Erro: Entrada inválida. ");
		}

		
		sc.close();
		System.out.println("***Method 2 end***");
	}

}

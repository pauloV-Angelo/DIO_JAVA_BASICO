import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual foi a nota do aluno? ");
		int nota = sc.nextInt();
		
		// condição ternária
		String resultado = (nota>=7)? "APROVADO" : nota>=5 ? "RECUPERAÇÃO": "REPROVADO";
		
		System.out.println(resultado);
		
		// utilizando if-else
//		if(nota>=7) {
//			System.out.println("APROVADO");
//		} else if(nota >=5) {
//			System.out.println("RECUPERAÇÃO");
//		} else {
//			System.out.println("REPROVADO");
//		}
		
		sc.close();

	}

}

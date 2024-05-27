
public class ForEmArrays {

	public static void main(String[] args) {

		// for em arrays
		String[] nomes = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Nome da posição " + i + " do array: " + nomes[i]);
		}

		System.out.println("---------------------------------------------------------");
		// laço for-each
		
		for (String nome : nomes) {
			
			System.out.println("nome do aluno é " +nome);
		
		}

	}

}

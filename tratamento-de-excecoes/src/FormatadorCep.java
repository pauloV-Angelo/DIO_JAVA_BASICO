
public class FormatadorCep {

	public static void main(String[] args) {

		// A aplicação simula um formatador de cep que utiliza a exception
		// CepInvalidoException do mesmo package
		try {
			String cep = "6030200";
			cep = formatarCep(cep);
			System.out.println("Cep formatado: " + cep);
		} catch (CepInvalidoException e) {
			System.out.println(e.getMessage());
		}

	}

	static String formatarCep(String cep) throws CepInvalidoException {
		if (cep.length() != 8) {
			throw new CepInvalidoException("Cep Inválido");
		}

		// simulando um cep formatado:
		return "60.300-200";
	}
}

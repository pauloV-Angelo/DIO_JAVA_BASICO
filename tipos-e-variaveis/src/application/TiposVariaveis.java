package application;

public class TiposVariaveis {

	public static void main(String[] args) {
		
		//tipos numéricos
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
	
	// tipos lógicos
	boolean verdadeiro = true;
	boolean falso = false;
	
	//tipos textuais 
	char a = 'a';
	String ola = "olá"; // String não é um tipo primitivo
	
	//variável vs constante
	int numeroVariavel = 10;
	numeroVariavel = 5;
	final int NUMEROCONSTANTE = 10; //não pode ser alterado devido à palavra final
	
	}

}

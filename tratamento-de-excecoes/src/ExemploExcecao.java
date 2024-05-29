import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

	public static void main(String[] args) {
		
		//Pode gerar uma NumberFormatException que extends de RunTimeException por isso a IDE não exige que uma possível exceção seja tratada no desenvolvimento
//		double valor = Double.valueOf("1.75a");

		//Pode gerar uma ParseException que extends de Exception, por isso precisa ser tratado no desenvolvimento
//		Number valor = NumberFormat.getInstance().parse("1.75");
		
		
//		System.out.println(valor);
	}

}

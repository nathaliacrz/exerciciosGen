package laçosRepeticao;

public class DoWhileExercicio1 {

	public static void main(String[] args) {

		int novoNumero, numero = 233;

		do {
			if (numero >= 300 && numero <= 400) {
				System.out.println(numero);
				novoNumero = numero + 3;
				numero = novoNumero;
			} else {
				System.out.println(numero);
				novoNumero = numero + 5;
				numero = novoNumero;
			}
			} while (numero >= 233 && numero <= 456);
	}
}

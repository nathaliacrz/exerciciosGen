package novaLista;

public class Exercicio01 {

	public static void main(String[] args) {

		for (int numero = 1000; numero <= 1999; numero++) {
			if (numero % 11 == 5) {
				System.out.println(numero);
			}
		}
	}
}

package laçosRepeticao;

import java.util.Scanner;

public class DoWhileExercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 0, soma = 0;

		System.out.println("Insira um numero: ");
		int numero = sc.nextInt();

		do {
			contador++;
			soma += contador;
			if (numero == contador) {
				break;
			}
			System.out.print(contador + "+");
		} while (contador != numero);

		System.out.println(numero + "=" + soma);

		sc.close();
	}
}

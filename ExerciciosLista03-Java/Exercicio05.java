package novaLista;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, soma = 0;

		do {
			System.out.println("Insira um número:");
			numero = sc.nextInt();

			soma += numero;

		} while (numero != 0);

		System.out.println("Soma: " + soma);

		sc.close();

	}
}

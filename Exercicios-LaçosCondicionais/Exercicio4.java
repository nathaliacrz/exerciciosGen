package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira numero: ");
		int numero = sc.nextInt();

		int resultado = numero % 2;

		if (resultado == 0 && numero > 0) {
			System.out.printf("%d = par e positivo.", numero);
		} else if (resultado == 0 && numero < 0) {
			System.out.printf("%d = par e negativo.", numero);
		} else if (resultado != 0 && numero < 0) {
			System.out.printf("%d = impar e negativo.", numero);
		} else {
			System.out.printf("%d = impar e positivo.", numero);
		}

		sc.close();
	}
}

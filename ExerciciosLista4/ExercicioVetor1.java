package vetores;

import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira 5 valores: ");

		double[] valor = new double[5];
		double maior = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor " + (i + 1) + ":");
			valor[i] = sc.nextDouble();

			if (valor[i] > maior) {
				maior = valor[i];
			}
		}
		System.out.println("Maior pontuacao: " + maior);
		sc.close();

	}
}

package laçosRepeticao;

import java.util.Scanner;

public class WhileExercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double soma, media;
		int totalValores;

		soma = 0;
		totalValores = 0;

		System.out.println("Insira um valor: ");
		double valor = sc.nextDouble();

		while (valor > 0) {
			totalValores++;
			soma += valor;
			System.out.println("Insira outro valor: ");
			valor = sc.nextDouble();
		}

		media = soma / totalValores;

		System.out.println("Valores lidos: " + totalValores);
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);

		sc.close();

	}

}

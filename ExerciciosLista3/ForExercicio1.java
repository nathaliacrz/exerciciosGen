package laçosRepeticao;

import java.util.Scanner;

public class ForExercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, pessoas, filhos, totalFilhos, mediaFilhos, salario100;
		double totalSalario, mediaSalario, maiorSalario, salario;

		totalSalario = 0;
		maiorSalario = 0;
		totalFilhos = 0;
		salario100 = 0;

		System.out.println("Insira o numero de pessoas: ");
		pessoas = sc.nextInt();

		for (i = 1; i <= pessoas; i++) {
			System.out.printf("Pessoa numero %d: \nQuantos filhos voce tem? ", i);
			filhos = sc.nextInt();
			System.out.println("Insira seu salario: ");
			salario = sc.nextDouble();

			if (salario > maiorSalario) {
				maiorSalario = salario;
			}

			if (salario <= 100) {
				salario100++;
			}

			totalSalario += salario;
			totalFilhos += filhos;

		}

		mediaSalario = totalSalario / pessoas;
		mediaFilhos = totalFilhos / pessoas;

		System.out.println("Media do salario da populacao: " + mediaSalario);
		System.out.println("Media do numero de filhos: " + mediaFilhos);
		System.out.println("Maior salario: " + maiorSalario);
		System.out.println("Pessoas salarios iguais ou abaixo de R$100:" + salario100);

		sc.close();
	}
}

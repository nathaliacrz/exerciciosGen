package novaLista;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menoresVinteEUm = 0;
		int maioresCinquenta = 0;

		System.out.println("Insira uma idade: ");
		int idade = sc.nextInt();

		while (idade != -99) {

			if (idade < 21) {
				menoresVinteEUm++;
			} else if (idade > 50) {
				maioresCinquenta++;
			}

		System.out.println("Insira uma idade: ");
		idade = sc.nextInt();

		}

		System.out.printf("\nPessoas com menos de 21 anos: %d", menoresVinteEUm);
		System.out.printf("\nPessoas com mais de 50 anos: %d", maioresCinquenta);
		
		sc.close();
	}
}

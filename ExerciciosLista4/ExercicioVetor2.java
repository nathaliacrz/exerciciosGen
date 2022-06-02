package vetores;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] vet = new double[10];

		double soma = 0, media;
		double maior = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
			soma += vet[i];
			
			if(vet[i] > maior) {
				maior = vet[i];
			}
		}

		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.print(vet[i] + " | ");
		}

		media = soma / 10;
		
		System.out.println("Media aritmetica: " + media);
		System.out.println("Maior numero apresentado: " + maior);
		sc.close();

	}
}

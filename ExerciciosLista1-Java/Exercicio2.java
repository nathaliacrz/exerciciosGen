package PrimeiraLista;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int dias, anos, meses, resto; 
		
		System.out.println("Digite a sua idade em dias: ");
		int duracao = sc.nextInt();
		
		anos = duracao / 365;
		resto = duracao % 365;
		
		meses = resto / 30;
		dias = resto % 30;
		
		System.out.printf("Você tem %d dias %d meses e %d anos de vida.", dias, meses, anos);

		sc.close();
	}
}

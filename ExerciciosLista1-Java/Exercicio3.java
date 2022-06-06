package PrimeiraLista;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tempo em segundos: ");
		int tempo = sc.nextInt();
		
		int horas = tempo / 3600;
		int resto = tempo % 3600;
		
		int minutos = resto / 60;
		int segundos = resto % 60;
		
		System.out.printf("O evento durou %d horas, %d minutos e %d segundos.", horas, minutos, segundos);

		sc.close();
	}
}

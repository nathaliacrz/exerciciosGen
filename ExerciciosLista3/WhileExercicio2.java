package laçosRepeticao;

import java.util.Scanner;

public class WhileExercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int novoNumero;
		
		System.out.println("Insira um numero: ");
		int numero = sc.nextInt();
		
		while(numero < 100) {
			novoNumero = numero * 3;
			System.out.println(novoNumero);
			numero = novoNumero;
		}

		sc.close();

	}
}

package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um valor: ");
		double numero = sc.nextDouble();
		
		if(numero > 100) {
			System.out.println(numero);
		} else {
			System.out.println("0.");
		}

		sc.close();
	}
}

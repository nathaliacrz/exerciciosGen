package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor da base:");
		double base = sc.nextDouble();
		
		System.out.println("Insira o valor da altura:");
		double altura = sc.nextDouble();
		
		if(base > 0 && altura > 0) {
			double areaDoTriangulo = (base * altura) / 2;
			System.out.printf("Area do triangulo e de %.2f metros quadrados.", areaDoTriangulo);
		} else {
			System.out.println("Valor invalido (numero negativo).");
		}
		
		
		sc.close();
	}
}

package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int horasTrabalhadas, horasExtras;
		double salario, salarioTotal, salarioExcedente;
		
		System.out.println("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		
		if(horasTrabalhadas > 50) {
			horasExtras = horasTrabalhadas - 50;
			salarioExcedente = horasExtras * 20; 
			salario = 50 * 10;
			salarioTotal = salario + salarioExcedente;
			System.out.printf("Salario: %.2f. \nSalario por horas extras: %.2f. \nSalario final: %.2f",
							salario, salarioExcedente, salarioTotal);
		} else if(horasTrabalhadas < 50) {
			salarioTotal = horasTrabalhadas * 10;
			System.out.printf("Nao houve horas extras trabalhadas. \nSalario Final: %.2f.", salarioTotal);
		}
	
		sc.close();

	}
}

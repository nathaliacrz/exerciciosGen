import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		double numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			double raizQ = Math.sqrt(numero);
			System.out.printf("O número %.2f é par e o valor da raiz quadrada é de %.2f.", numero, raizQ);
		} else if(numero % 2 != 0) {
			double aoQuadrado = Math.pow(numero, 2);
			System.out.printf("O número %.2f é ímpar e o valor do número elevado ao quadrado é de %.2f.", numero, aoQuadrado);
		}

		
		sc.close();
	}
}

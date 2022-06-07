import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero: ");
		int num1 = sc.nextInt();
		System.out.println("Insira o segundo numero: ");
		int num2 = sc.nextInt();
		System.out.println("Insira o terceiro numero: ");
		int num3 = sc.nextInt();
		
		
		if(num1 < num2) {
			if(num2 < num3) {
				System.out.println(num1 + " " + num2 + " " + num3);
			} else if(num1 < num3){
				System.out.println(num1 + " " + num3 + " " + num2);
			}
		} else if(num2 < num3) {
			if(num1 < num3) {
				System.out.println(num2 + " " + num1 + " " + num3);
			} else {
				System.out.println(num2 + " " + num3 + " " + num1);
			}
		} else if(num3 < num1) {
			if(num1 > num2) {
				System.out.println(num3 + " " + num2 + " " + num1);			
			} else if(num3 < num2){
				System.out.println(num3 + " " + num1 + " " + num2);			
			}
		}
		
		sc.close();
		
		
		
	}
}

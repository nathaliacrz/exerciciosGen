import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira sua idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Infantil.");
		} 
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Juvenil.");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Adulto.");
		} else {
			System.out.println("Idade inválida.");
		}
	
			
		sc.close();
		
	}
}


public class Exercicio01 {

	public static void main(String[] args) {

		int num1 = 3;
		int num2 = 1;
		int num3 = 2;

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("Maior numero: " + num1);
			}
		} else if (num2 > num3) {
			System.out.println("Maior numero: " + num2);
		} else {
			System.out.println("Maior numero: " + num3);
		}

	}

}

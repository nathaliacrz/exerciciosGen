package novaLista;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int pessoas = 1;
		int idade, velhinhosAgressivos = 0, criancaFeliz = 0;
		int sexo = 0, feminino = 0, masculino = 0, outros = 0;
		int comportamento = 0,calmo = 0, nervoso = 0, agressivo = 0;
		int lindonasNervosas = 0, machosAgressivos = 0, outrosPassivos = 0;
		
		while (pessoas <= 2) {

			System.out.printf("%d° indivíduo: \n", pessoas);

			System.out.println("Insira a idade: ");
			idade = sc.nextInt();

			System.out.println("Sexo: \n1- Feminino \n2- Masculino \n3-Outros \n");
			sexo = sc.nextInt();

			if(sexo < 0 || sexo > 3) {
				System.out.println("Opção inválida. Insira um número válido.");
				sexo = sc.nextInt();
			}
			
			switch (sexo) {
			case 1:
				feminino++;
				break;
			case 2:
				masculino++;
				break;
			case 3:
				outros++;
			}

			System.out.println(
					"Comportamento: \n1- A pessoa é calma. \n2- A pessoa é nervosa. \n3- A pessoa é agressiva. \n");
			comportamento = sc.nextInt();

			if(comportamento < 0 || comportamento > 3) {
				System.out.println("Opção inválida. Insira um número válido.");
				comportamento = sc.nextInt();
			}
			
			switch (comportamento) {
			case 1:
				calmo++;
				break;
			case 2:
				nervoso++;
				break;
			case 3:
				agressivo++;
			}
			
			if(sexo == 1 && comportamento == 2) {
				lindonasNervosas++;
			}
			else if(sexo == 2 && comportamento == 3) {
				machosAgressivos++;
			}
			else if(sexo == 3 && comportamento == 1) {
				outrosPassivos++;
			}
			else if(idade > 40 && comportamento == 2) {
				velhinhosAgressivos++;
			}
			else if(idade < 18 && comportamento == 1) {
				criancaFeliz++;
			}

			pessoas++;
			
		}
		
		System.out.println("Quantidade de respostas: " + (pessoas - 1) +"\nMulheres: " + feminino 
				                 + "\nHomens: " + masculino+ "\nOutros: " + outros);
		System.out.println();
		System.out.println("Temperamento das pessoas: \nCalmas: " + calmo + "\nNervosas: " + nervoso + "\nAgressivas: " + agressivo);
		System.out.println();
		System.out.println("Mulheres nervosas: " + lindonasNervosas);
		System.out.println("Homens agressivos: " + machosAgressivos);
		System.out.println("Não binários calmos:" + outrosPassivos);
		System.out.println("Pessoas nervosas acima de 40 anos: " + velhinhosAgressivos);
		System.out.println("Pessoas calmas abaixo de 18 anos: " + criancaFeliz);
		
		sc.close();

	}
}

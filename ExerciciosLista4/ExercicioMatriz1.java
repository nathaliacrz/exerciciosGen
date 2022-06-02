package vetores;

import java.util.Scanner;

public class Matrizzz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] N1 = new int[2][2];
		int[][] N2 = new int[2][2];
		int[][] M1 = new int[2][2];
		int[][] M2 = new int[2][2];

		System.out.println("Insira os elementos da matriz: ");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				N1[i][j] = sc.nextInt();
			}
		}
		System.out.println();

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				N2[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matriz 1: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("| " + N1[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.println("Matriz 2: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("| " + N2[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.println("Matriz M1:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				M1[i][j] = N1[i][j] + N2[i][j];
				System.out.print("| " + M1[i][j] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("Matriz M1:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				M2[i][j] = N1[i][j] - N2[i][j];
				System.out.print("| " + M2[i][j] + " | ");
			}
			System.out.println();
		}

		sc.close();

	}
}

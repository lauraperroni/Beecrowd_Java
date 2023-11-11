package SolvedExercises;

import java.util.Scanner;

public class e_1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int par = 0;
		int impar = 0;
		int posi = 0;
		int nega = 0;

		for (int i = 0; i < 5; i++) {
			x = sc.nextInt();

			if (x % 2 == 0) {
				par++;
			} else if (x % 2 != 0) {
				impar++;
			}

			if (x > 0 && x != 0) {
				posi++;
			} else if (x < 0 && x != 0) {
				nega++;
			}
		}
		System.out.printf("%d valor(es) par(es)%n", par);
		System.out.printf("%d valor(es) impar(es)%n", impar);
		System.out.printf("%d valor(es) positivo(s)%n", posi);
		System.out.printf("%d valor(es) negativo(s)%n", nega);
	}
}

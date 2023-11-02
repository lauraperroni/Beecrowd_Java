package SolvedExercises;

import java.util.Scanner;

public class e_1072 {

	/* Exercício 5 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aler = sc.nextInt();
		int in = 0, out = 0;
		int lido = 0;
		
		for (int i = 0; i < aler; i++) {
			lido = sc.nextInt();
			if (lido >= 10 && lido <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.printf("%d in%n%d out%n", in, out);
	}
}

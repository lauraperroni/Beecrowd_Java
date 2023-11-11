package SolvedExercises;

import java.util.Scanner;

public class e_1046 {

	public static void main(String[] args) {
		int dura;

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int fin = sc.nextInt();

		if (in < fin) {
			dura = fin - in;
		} else {
			dura = 24 - in + fin;
		}
		System.out.printf("O JOGO DUROU: %d HORA(S)", dura);
	}
}
package SolvedExercises;

import java.util.Scanner;

public class e_1003 {

	public static void main(String[] args) {

		int soma;
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		System.out.printf("SOMA = " + soma);
		sc.close();
	}
}

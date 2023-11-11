package SolvedExercises;

import java.util.Scanner;

public class e_1044 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextInt();

		if (x % y == 0 || y % x == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");

		}
	}
}

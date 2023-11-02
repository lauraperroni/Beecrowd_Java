package SolvedExercises;

import java.util.Locale;
import java.util.Scanner;

public class e_1116 {

	public static void main(String[] args) {
		int qnt = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		qnt = sc.nextInt();

		for (int i = 0; i < qnt; i++) {
			double x = 0.0;
			double y = 0.0;
			double div = 0.0;
			
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			div = x / y;

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.printf("%.1f%n", div);
			}
		}
	}
}

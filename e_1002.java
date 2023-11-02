package SolvedExercises;

import java.util.Locale;
import java.util.Scanner;

public class e_1002 {

	public static void main(String[] args) {
		/*
		 * Exercise 2:
		 */
		Locale.setDefault(Locale.US);
		Scanner sc1 = new Scanner(System.in);
		double pi = 3.14159;
		double raio;
		raio = sc1.nextDouble();
		double area = pi * raio * raio;
		System.out.printf("A = %.4f%n", area);
		sc1.close();

	}

}

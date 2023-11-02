package SolvedExercises;

import java.util.Locale;
import java.util.Scanner;

public class e_1012 {

	public static void main(String[] args) {
		/*
		 * Exercise 6
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc5 = new Scanner(System.in);
		double aaa, bbb, ccc, A1, A2, A3, A4, A5;
		double pi2 = 3.14159;

		aaa = sc5.nextDouble();
		bbb = sc5.nextDouble();
		ccc = sc5.nextDouble();

		A1 = aaa * ccc / 2.0;
		A2 = ccc * ccc * pi2;
		A3 = (aaa + bbb) * ccc / 2;
		A4 = bbb * bbb;
		A5 = aaa * bbb;

		System.out.printf("TRIANGULO: %.3f%n", A1);
		System.out.printf("CIRCULO: %.3f%n", A2);
		System.out.printf("TRAPEZIO: %.3f%n", A3);
		System.out.printf("QUADRADO: %.3f%n", A4);
		System.out.printf("RETANGULO: %.3f%n", A5);
		sc5.close();

	}

}

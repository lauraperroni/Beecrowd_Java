package SolvedExercises;

import java.util.Locale;
import java.util.Scanner;

public class e_1007 {

	public static void main(String[] args) {
		/*
		 * Exercise 3:
		 */
		Scanner sc2 = new Scanner(System.in);
		int aa, bb, cc, dd, ee;
		aa = sc2.nextInt();
		bb = sc2.nextInt();
		cc = sc2.nextInt();
		dd = sc2.nextInt();
		ee = (aa * bb) - (cc * dd);
		System.out.println("DIFERENCA = " + ee);
		sc2.close();

	}

}

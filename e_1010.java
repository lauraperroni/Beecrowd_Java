package SolvedExercises;
import java.util.Locale;
import java.util.Scanner;

public class e_1010 {

	public static void main(String[] args) {
		/*
		 * Exercise 5
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc4 = new Scanner(System.in);
		int cod1, cod2, num1, num2;
		double v1, v2, apag;
		cod1 = sc4.nextInt();
		num1 = sc4.nextInt();
		v1 = sc4.nextDouble();
		cod2 = sc4.nextInt();
		num2 = sc4.nextInt();
		v2 = sc4.nextDouble();
		apag = ((double) num1 * v1) + ((double) num2 * v2);
		System.out.printf("VALOR A PAGAR = R$ %.2f", apag);
		sc4.close();

	}

}

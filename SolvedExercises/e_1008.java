package SolvedExercises;

import java.util.Locale;
import java.util.Scanner;

public class e_1008 {

	public static void main(String[] args) {
		/*
		 * Exercise 4:
		 */
		Locale.setDefault(Locale.US);
		Scanner sc3 = new Scanner(System.in);
		int num, horas;
		double valorhora;
		double salario;
		num = sc3.nextInt();
		horas = sc3.nextInt();
		valorhora = sc3.nextDouble();
		salario = (double) horas * (double) valorhora;
		System.out.printf("NUMBER = %s%n", num);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		sc3.close();

	}

}

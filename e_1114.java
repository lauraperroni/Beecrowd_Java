package SolvedExercises;

import java.util.Scanner;

/*Exercício 1*/

public class e_1114 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int senha = 2002;
		int ten = 0;

		ten = sc.nextInt();
		while (ten != 2002) {
			System.out.println("Senha Invalida");
			ten = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
	}
}

package SolvedExercises;

import java.util.Scanner;

/*Exercício 3*/

public class e_1134 {
	public static void main(String[] args) {
		int tipo = 0;
		int alc = 0;
		int gas = 0;
		int die = 0;
		Scanner sc = new Scanner(System.in);

		while (tipo != 4) {

			tipo = sc.nextInt();
			while (tipo < 1 || tipo > 4) {
				tipo = sc.nextInt();
			}
			switch (tipo) {
			case 1:
				alc++;
				break;
			case 2:
				gas++;
				break;
			case 3:
				die++;
				break;
			}
		}
		System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", alc, gas, die);
	}
}

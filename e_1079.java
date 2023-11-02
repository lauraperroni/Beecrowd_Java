package SolvedExercises;
import java.util.Locale;
import java.util.Scanner;
public class e_1079 {

	/* Exercício 6 */

	public static void main(String[] args) {
		int qnt;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			qnt = sc.nextInt();
		
		for (int i = 0; i < qnt; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			
			double m = ((2.0*x)+(3.0*y)+(5.0*z))/10.0;
			System.out.printf("%.1f%n",m);
		}
	}
}

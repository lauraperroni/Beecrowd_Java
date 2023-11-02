package SolvedExercises;
import java.util.Scanner;

public class e_1143 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d%n", i, i*i, i*i*i);
		}
	}
}

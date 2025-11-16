package ex_16a_Patterns;

import java.util.Scanner;

public class P2_Bottom_left_Right_angled_triangle {

	public static void main(String[] args) {
		System.out.println("Enter a number between 1-10 ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= i)
					System.out.print(" * ");
			}
			System.out.println();
		}

	}

}

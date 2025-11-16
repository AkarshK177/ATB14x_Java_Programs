package ex_16a_Patterns;

import java.util.Scanner;

public class P4_Left_Top_RAT {

	public static void main(String[] args) {
		System.out.println("Enter a number between 1-10 ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j <= (n + 1))
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}
}

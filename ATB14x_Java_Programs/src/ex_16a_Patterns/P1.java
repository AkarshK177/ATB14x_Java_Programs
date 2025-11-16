package ex_16a_Patterns;

public class P1 {

	public static void main(String[] args) {
		int n = 5;
		/*
		 * EASY METHOD for(int i=1; i<=n; i++) { System.out.print(" * "); }
		 */

		// MATRIX METHOD
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1)
					System.out.print(" * ");
			}
		}
	}
}

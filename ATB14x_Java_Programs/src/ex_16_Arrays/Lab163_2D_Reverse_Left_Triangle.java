package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Reverse_Left_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j <= n   ; j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

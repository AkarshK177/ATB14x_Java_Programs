package ex_10_For_Loop;

import java.util.Scanner;

public class Task_Factorial_HR {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for Factorial : ");
		int n = sc.nextInt();
		int fact=1;
		if(n == 0)
			System.out.println(1);
		else {
		for(int i=1; i <= n ; i++) {
			fact = fact * i ;
		}
		
		System.out.println(fact);
		}
	}
}

package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Iterator;
import java.util.Scanner;

public class Lab149_Program_CharArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string for reversing : ");
		String input = sc.next();
		
		char[] arr = input.toCharArray();
		String reverse = "";
		
		for(int i = arr.length-1; i >= 0; i-- ) {
			reverse = reverse + arr[i];
		}
		System.out.println(reverse);
	}
}

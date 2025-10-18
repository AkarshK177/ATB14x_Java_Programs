package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab150_String_Palindrome {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input string to reverse");
		String input = sc.next();
		
		String reverse = "";
		
		for(int i = input.length() - 1; i >= 0; i--) {
			reverse += input.charAt(i);
		}
		
		if(reverse.equalsIgnoreCase(input))
			System.out.println("This is Palindrome");
		else
			System.out.println("Not a Palindrome");
		
	}
}

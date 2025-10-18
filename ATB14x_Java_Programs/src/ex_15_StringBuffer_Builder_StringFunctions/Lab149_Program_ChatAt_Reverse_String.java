package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab149_Program_ChatAt_Reverse_String {
    public static void main(String[] args) {
        // Write a program to reverse a string without using inbuilt functions.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string, i will reverse it");
        String input = sc.next();
        
        String reverse = "";
        
        for(int i = input.length()-1; i>=0 ; i--) {
        	reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);
        
	}
}

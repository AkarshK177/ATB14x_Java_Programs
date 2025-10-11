package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {

        /* 
        You need to take a user input and ask for the integer from 1 to 7.
        And if user enters 1 to 7,
        you will tell which day it is.
        */
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7");

        if (scanner.hasNextInt()) {
        	//hasNextInt checks its integer or not
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter int number from 1 to 7 only, you fool!");

            }

        } else {
            System.out.println("Enter int you FOOL!");
        }


    }
}
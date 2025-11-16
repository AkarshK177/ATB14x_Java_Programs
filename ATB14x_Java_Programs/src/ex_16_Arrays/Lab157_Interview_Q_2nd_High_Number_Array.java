package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 100, 34, 10, 1, 100, 3, 4, 100};//100,34
       
        // with In-built
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 2]);

        //without In-built
        System.out.println("----------My logic------------");
        int max = numbers[0];
        int max_index = numbers.length - 1; 
        for(int i = 0; i <= max_index; i++ ) {
        	if(numbers[i] > max)
        		max = numbers[i];
        }
        System.out.println("Maximum number is : " + max);
        
        int second_max = numbers[0];
        for(int i = 0; i <= max_index; i++ ) {
        	if(numbers[i] > second_max && numbers[i]<max)
        		second_max = numbers[i];
        }
        System.out.println("Second maximum number is : " + second_max);
        System.out.println("=========================================");
       
        // Enhanced Logic
        System.out.println("----------Enhanced logic------------");
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : numbers) {

            if (num > highest) {
                secondHighest = highest;
                highest = num; }
//            } else if (num > secondHighest && num != highest) {
//
//                secondHighest = num;
//            }


        }
        System.out.println("Maximum number is : " + highest);
        System.out.println("Second maximum number is : " + secondHighest);
        
    }
}
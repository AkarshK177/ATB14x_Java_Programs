package ex_02_Java_Basics;

public class Lab024_printF {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

//		System.out.println(a);
//		System.out.println(b);
//		
//		System.out.print(a);
//		System.out.print(b);

		System.out.printf("Value of a = %d", a);
		System.out.println();
		System.out.printf("Value of b = %d", b);
		System.out.println();

//		%d -> int, byte, long, short, - datatypes
//		%s -> String
//		%f -> float, double
//		%b -> boolean

		System.out.println();
		int table = 11;
		System.out.printf("%d x 1 = %d", table, table * 1);
		System.out.println();
		System.out.printf("%d x 2 = %d", table, table * 2).println();
		System.out.printf("%d x 3 = %d", table, table * 3).println();
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.printf("%d x 9 = %d", table, table * 9).println();
		System.out.printf("%d x 10 = %d", table, table * 10).println();

	}
}

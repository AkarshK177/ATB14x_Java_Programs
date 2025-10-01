package ex_02_Java_Basics;

public class Lab010_Multiple_Main {
	public static void main() {
		System.out.println("First Main Method");
	}

	public static void main(String[] args) {
		System.out.println("Second Main Method");
	}

}
// This is called Main Method overloading 
//JVM finds it and calls it automatically "public static void main(String[] args)"
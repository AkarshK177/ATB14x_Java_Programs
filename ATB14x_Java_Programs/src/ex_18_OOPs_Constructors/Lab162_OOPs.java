package ex_18_OOPs_Constructors;

public class Lab162_OOPs {
	public static void main(String[] args) {
		Baby b1 = new Baby();
		new Baby();
		new Baby();
		
		Baby b2;
		// System.out.println(b2.name); 
		//Compile time Error ("The local variable b2 may not have been initialized")
	}

}
class Baby{
	String name;
	
	Baby(){
		System.out.println("I am called, Object is created");
	}
}

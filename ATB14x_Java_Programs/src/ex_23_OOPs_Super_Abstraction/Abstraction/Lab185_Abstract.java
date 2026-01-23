package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab185_Abstract {
	public static void main(String[] args) {
		Son s1 = new Son();
		s1.loan50k(10);
	}
}

class AmitFather{
	void loan50k(){
		System.out.println("Defaault");
	}
	void loan10k(){
		System.out.println("Given");
	}
}

class Son extends AmitFather{
	
	void loan50k(int a){
		System.out.println("Ok, I am Amit, I will give the Father Loan of 50k");
	}
}
package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab187_Interface_P1 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.drive();
		
	}
}


class Car2 implements Engine1,Brake{
	
	void drive(){
		this.startEngine();
		this.applyBrake();
		this.stopEngine();
		testEngine();
	}
	
	@Override
	public void applyBrake() {
		System.out.println("Stop the Car");
		
	}

	@Override
	public void startEngine() {
		System.out.println("Start the Engine");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Stop the Engine");
		
	}
	
}

interface Brake{
	void applyBrake();
}

interface Engine1{
	void startEngine();
	void stopEngine();
	
	default void testEngine() {
		System.out.println("Concrete Complete");
	}
}
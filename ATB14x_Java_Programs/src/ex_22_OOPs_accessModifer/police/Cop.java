package ex_22_OOPs_accessModifer.police;

public class Cop {

	public int gun;
	private String icard;

	// Method and Behavior
	protected void canIShoot() {
		System.out.println("Yes you can shoot");
	}

	void thisDefaultF1() {
		System.out.println("Hi, Cop!");
	}
	
}
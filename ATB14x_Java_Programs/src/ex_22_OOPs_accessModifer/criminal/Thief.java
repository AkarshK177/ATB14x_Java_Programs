package ex_22_OOPs_accessModifer.criminal;

import ex_22_OOPs_accessModifer.police.Cop;

public class Thief extends Cop {
	public static void main(String[] args) {
		Thief thief = new Thief();
		thief.canIShoot(); // Protected in different package.
//		In a different package, a protected member can be accessed
//		ONLY through the child class object,
//		NOT through a parent class reference.
//		Below code will not work
//	***********
//		Cop thief = new Cop();
//		thief.canIShoot();
//	***********	
//		thief.thisDefaultF1(); 
//		default is not accessible in any manner outside the package.
//	***********
	}
}
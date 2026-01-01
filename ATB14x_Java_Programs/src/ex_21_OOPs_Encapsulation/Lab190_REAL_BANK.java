package ex_21_OOPs_Encapsulation;

import java.util.Scanner;

public class Lab190_REAL_BANK {
	public static void main(String[] args) {
		ICICIBank bank = new ICICIBank();
		System.out.println("Current balance: " + bank.getBalance());
		
		boolean b = false;
		//get Passcode from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4 digit pass code");
		
		//Check authorisation and update the balance
		try {
			int pass = sc.nextInt();
			if(pass == 1414) {
				b = true;
				System.out.println("Authentication Successful** Now you can update the balance.");
				System.out.println("Enter the amount to be updated: ");
				long newBal = sc.nextLong();
				bank.setBalance(newBal, b);
			}else {
				System.out.println("Unauthorised access!");
			}
		} catch (Exception e) {
			System.out.println("Invalid passcode XXX");
		}
			
		
		
	}
	
}

class ICICIBank{
	private String name;
	private long bal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return bal;
	}
	public void setBalance(long bal, boolean isCashier) {
		if (isCashier) {
			this.bal = bal;
			System.out.println("Updated balance is: " + bal);
		} else {
			System.out.println("Unauthorised to change the balance");
		}
	}
	
	
}
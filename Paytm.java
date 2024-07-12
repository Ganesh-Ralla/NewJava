package com.exe;
import java.util.Scanner;

class Payment{
	Scanner sc= new Scanner(System.in);
	int i;
	int amnt,blc=2500;
	void mobilenumber() {
		System.out.println("Enter mobile number");
		String nmbr=sc.next();
		boolean b = false;
		
		char data[]= new char[nmbr.length()];
		data=nmbr.toCharArray();
		//verifying the number 
		if(nmbr.length()==10) {
			if(nmbr.charAt(0)=='6'||nmbr.charAt(0)=='7'||nmbr.charAt(0)=='8'||nmbr.charAt(0)=='9') {
				//System.out.println("Valid number");
				System.out.println("Enter the amount");
				amnt=sc.nextInt();
				b=true;
			}
			else {
				System.out.println("Invalid number");
			}
			
			//if the number is valid
			if(b==true) {
				System.out.println("Enter your pin");
				int pin=sc.nextInt();
				if(pin==4227) {
					for(i=0;i<nmbr.length()-4;i++) {
						data[i]='X';
					}
					System.out.print(amnt +" sending to +91");
					System.out.println(data);
					for(i=3;i>0;i--) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(i);
					}
					
					System.out.println("Payment successful");
					
				}
				else {
					System.out.println("Incorrect pin");
				}
				
			}
	}
		
	}
	void contact() {
		
		String name[]= {"Giri","Sunny","Abhi","Shiva"};
		System.out.println("Select your contact");
		for(i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		String select=sc.next();
		for(i=0;i<name.length;i++) {
			if(select.equals(name[i])) {
				System.out.println("Enter the amount");
				amnt=sc.nextInt();
				System.out.println("Enter your pin");
				int pin=sc.nextInt();
				if(pin==4227) {
					System.out.println(amnt+" sending to "+select);
					for(i=3;i>0;i--) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(i);
					}
					
					System.out.println("Payment successful");break;	
					
				}
					
			}
		}
		
	}
	void show() {
		System.out.println("Enter your pin");
		int pin=sc.nextInt();
		if(pin==4227) {
			System.out.println("Checking your balance");
			for(i=3;i>0;i--) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
			System.out.println("Your balance is "+blc);

		}
			}
	
}

public class Paytm {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Paytm");
		System.out.println("1.Mobile number\n2.Contacts\n3.Check balance");
		Payment p=new Payment();
		int op=sc.nextInt() ;
		switch(op) {
		case 1:p.mobilenumber();break;
		case 2:p.contact();break;
		case 3:p.show();break;
		default : System.out.println("No operation with the selected key");

		
		}
		
	}

}

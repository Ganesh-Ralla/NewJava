package com.exe;
import java.util.Random; 
import java.util.Scanner;

public class Verification {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//string to take the number as input
		String nmbr;
		Random rand= new Random();
		int i;
		boolean b=false;
		
		System.out.println("Aadhar Verification ");
		System.out.println("Enter your mobile number ");
		//taking string and converting into char array
		nmbr=sc.next();
		
		char data[]= new char[nmbr.length()];
		data=nmbr.toCharArray();
		//verifying the number 
		if(nmbr.length()==10) {
			if(nmbr.charAt(0)=='6'||nmbr.charAt(0)=='7'||nmbr.charAt(0)=='8'||nmbr.charAt(0)=='9') {
				System.out.println("Valid number");
				b=true;
			}
			else {
				System.out.println("Invalid number");
			}
			//if the number is valid
			if(b==true) {
				for(i=0;i<nmbr.length()-4;i++) {
					data[i]='X';
				}
				System.out.print("OTP is sent to +91");
				System.out.println(data);
			}
			//random variable to generate an number
			int r=rand.nextInt(1000,9999);
			System.out.println("OTP is "+r);
			System.out.println("Enter your OTP");
			int otp=sc.nextInt();
			if(r==otp) {
				System.out.println("Verification is Successful");
			}
			else {
				System.out.println("Invalid OTP");
			}

		}
		else {
			System.out.println("Invalid number ");
		}
		
		
		

	}

}

package practisejava;
import java.util.Scanner;

public class Atmdatalimit {

	public static void main(String[] args) {
		System.out.println("1.check balance \n2.credit amount \n3.debit amount");
		int act_blc=60000,credit,debit,pin,op,sum=0;
		Scanner sc=new Scanner(System.in);
		op=sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("Enter your pin");
			pin=sc.nextInt();
			if(pin==4227) {
				System.out.println("Current amount is "+act_blc);break;
			}
			else {
				System.out.println("Incorrect pin");break;
			}
		case 2:
			System.out.println("Enter your pin");
			pin=sc.nextInt();
			if(pin==4227) {
				System.out.println("Enter the deposit amount");
				credit=sc.nextInt();
				System.out.println("current amount "+act_blc);
				act_blc+=credit;
				System.out.println("amount after credit "+act_blc);
			}
			else {
				System.out.println("Incorrect pin");break;
			}
		case 3:
			System.out.println("Enter your pin");
			pin=sc.nextInt();
			if(pin==4227) {
				while(act_blc>0) {
					System.out.println("Enter the debit amount");
					debit=sc.nextInt();
					sum+=debit;
					if(debit>act_blc) {
						System.out.println("Insufficient funds");break;
					}
					else if(sum>40000) {
						System.out.println("limit exceeded");break;
					}
					else {
						System.out.println("current amount "+act_blc);
						act_blc-=debit;
						System.out.println("amount after debit "+ act_blc);
					}
				}
				
			}
			else {
				System.out.println("Incorrect pin");break;
			}
		default: System.out.println("Please select the given option \nTry again");
		}
		

	}

}

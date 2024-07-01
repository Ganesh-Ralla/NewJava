package practisejava;
import java.util.Scanner;

public class Atmdatalimit {

	public static void main(String[] args) {
		//Giving options to perform operations
		System.out.println("1.check balance \n2.credit amount \n3.debit amount");
		int act_blc=60000,credit,debit,pin,op,sum=0;
		Scanner sc=new Scanner(System.in);
		//selecting the operation
		op=sc.nextInt();
		switch(op) {
		case 1:
			//when operation is selected pin is required to do the operation
			System.out.println("Enter your pin");
			pin=sc.nextInt();
			//if pin is correct operation is performed 
			//operation 1 is to show the current amount in the account
			if(pin==4227) {
				System.out.println("Current amount is "+act_blc);break;
			}
			//else prints incorrect pin
			else {
				System.out.println("Incorrect pin");break;
			}
		case 2:
			System.out.println("Enter your pin");
			pin=sc.nextInt();
			//operation 2 is to credit the amount to the account
			if(pin==4227) {
				//entering credit amount
				System.out.println("Enter the deposit amount");
				credit=sc.nextInt();
				//printing the amount
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
			//operation 3 is to perform debit operation
			if(pin==4227) {
				//account balance must be greater than 0
				while(act_blc>0) {
					//entering debit amount
					System.out.println("Enter the debit amount");
					debit=sc.nextInt();
					//sum is to count the debit amount for more than one debit operation
					sum+=debit;
					//if debit amount is greater than current amount
					if(debit>act_blc) {
						System.out.println("Insufficient funds");break;
					}
					// debit amount must be less than 40000
					else if(sum>40000) {
						System.out.println("limit exceeded");break;
					}
					//if amount is less than 40000 then it is debited
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
			//if the option is not selected from the given options then print the statement
		default: System.out.println("Please select the given option \nTry again");
		}
		

	}

}

package practisejava;
import java.util.Scanner;
public class StrRev {

	public static void main(String[] args) {
		//scanning function to take the input of string
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		//assigning the string to name 
		String name=sc.next();
		
		//creating an char array to store the string in char form
		char arr[]= new char[name.length()];
		//converting string into char array
		arr=name.toCharArray();
		
		int i;
		//iterating the array to print in reverse order
		for(i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}

	}

}

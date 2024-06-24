package practisejava;
import java.util.Scanner;
public class StrVowel {

	//method for finding vowels and consonants
	void Vowel() {
		//taking input the string
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		//assigning the value to name
		String name=sc.next();
		
		//creating a char array
		char arr[]= new char[name.length()];
		//converting string into array
		arr=name.toCharArray();
		
		//variables for iteration and counting vowels and consonants
		int i,v_count=0,c_count=0;
		for(i=0;i<arr.length;i++) {
			//condition for checking each element in array whether it is vowel or consonant
			if(arr[i] == 'a' || arr[i]=='e' || arr[i]=='i'|| arr[i]=='o' || arr[i]=='u'||
					arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') {
				//counting the vowels
				v_count+=1;
			}
			else {
				//counting the consonants
				c_count+=1;
			}
		}
		//printing vowels and consonants count
		System.out.println("Vowels are "+v_count);
		System.out.println("Consonants are "+c_count);
	}
	public static void main(String[] args) {
		//creating method for the class StrVowel
		StrVowel sv= new StrVowel();
		//calling the vowel method
		sv.Vowel();
		

	}

}

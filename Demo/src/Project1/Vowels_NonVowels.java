package Project1;
import java.util.Scanner;
public class Vowels_NonVowels {

	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		System.out.println("Enter some Words or letters");
		String a = io.next();
		
//		String a = "WELCOME";
		int Vowels = 0 ;
		int NonVowels = 0 ;
		
		for(int i=0; i < a.length(); i++) {
			
			char ch = a.charAt(i);
			
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' ||ch=='U') {
				Vowels++;
			}
			else {
				NonVowels++;
			}
		}
		System.out.println(Vowels);
		System.out.println(NonVowels);
	}

}

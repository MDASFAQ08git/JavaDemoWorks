package Project1;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		//check palindrome number
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = ip.nextInt();
		int i=0,  j=0, k=0;
		int n = a;
		while(n>0) {
			k = n % 10;
			i = (i*10)+k;
			n = n/10;
		}
//		System.out.println(i);
		if(a == i) {
			System.out.println(i +" " + "It is a palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
		
			
		
		//Print palindrome number
//		for (int a=1; a<=100; a++) {
//			int n, i=0,  j=0, k=0;
//			n = a;
//			while(n>0) {
//				k = n % 10;
//				i = (i*10)+k;
//				n = n/10;
//			}
//			if(a == i) {
//				System.out.println(a);
//			}
//		}
		
		//count palindrome numbers
//		int Result = 0;
//		for (int a=1; a<=100; a++) {
//			int n, i=0,  j=0, k=0;
//			n = a;
//			while(n>0) {
//				k = n % 10;
//				i = (i*10)+k;
//				n = n/10;
//			}
//			if(a == i) {
//				Result = Result + 1;
//			}
//		}
//		System.out.println(Result);
	}

}

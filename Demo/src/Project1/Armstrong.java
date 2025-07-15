package Project1;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		
		//Check weather it is Armstrong or not
		Scanner io = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = io.nextInt();
		int n, b = 0, c=0;
		
		n = a;
		while(n>0) {
			b = n % 10;
			c = c+(b*b*b);
			n = n /10;
		}
		if(a == c) {
			System.out.println("It is a Armstrong number");
		}
		else {
			System.out.println("Not a Armstrong number");
		}
		
		
		
		//count Armstrong numbers
//		int Result = 0;
//		for (int i=1; i<=1000; i++) {
//			
//			int n, b = 0, c=0;
//			
//			n = i;
//			while(n>0) {
//				b = n % 10;
//				c = c+(b*b*b);
//				n = n /10;
//			}
//			if(i == c) {
//				Result = Result + 1;
//			}
//		}
//		System.out.println(Result);
		
		
		
		
		//To print Armstrong numbers
//		for(int a=1; a<=1000; a++) {
//		int n,  b=0 , c=0 ;
//		n = a;
//		while(n>0) {
//			b = n % 10;
//			c = c+(b*b*b);
//			n = n / 10;
//		}
//			if(a == c) {
//				System.out.println(a);
//				}
//		
//		}
		
	}
}

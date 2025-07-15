package Project1;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = ip.nextInt();
		int i=0,  j=0;
//		while(a > 0) {
//			   i = a % 10; 
//			   j = (j * 10) + i; 
//			   a = a / 10; 
//		}
//		System.out.println("Resvese number is " + j);
		while(a>0) {
			i = (i*10)+a%10;
			a = a /10;
		}
		System.out.println(i);
	}

}

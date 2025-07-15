package Project1;
import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		
		//SWAPPING WITH EXTRA 1 VARIALBE
//		int a , b , c ,d;
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter number ");
//		a = in.nextInt();
//		b = in.nextInt();
//		c = in.nextInt();
//		d=c;
//		c=a;
//		a=d;
//		System.out.println("YOur Numbers are ");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		
		
		
		//SWAPPING WITHOUT ANY VARIALBE
		int e ,f;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		e = input.nextInt();
		f = input.nextInt();
		// e = 10 ,  f = 20;
		e= e+f; // e = 10 + 20 = 30
		f=e-f;  // f = 30 - 20 = 10
		e=e-f;  // e = 30 - 10 = 20
		
		System.out.println("Swapped numbers");
		System.out.println(e);
		System.out.println(f);
	}
}

package Project1;

public class FabonacciSeries {

	public static void main(String[] args) {
		
		//to find Fibonacci series

//		int a = 0, b=1, c =2;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//
//		for(int i = 3; i<=5; i++) {
//			int d= a + b + c;
//			System.out.println(d);
//			a=b;
//			b=c;
//			c=d;
//		}
		
		int a = 0, b =1;
		System.out.println(a);
		System.out.println(b);
		
		for(int i= 2; i<=10; i++) {
			int c = a + b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
		
//		int n = 0;
//		int m = 1;
//		int t = 0;
//		
//		for( m = 1; m <= 10; m++) {
//			t += n + m;
//		}
//		System.out.println(t + "fibonaaci series");

	}

}

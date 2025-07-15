package Project1;
import java.util.*;

public class Exception_Handling {

	public static void main(String[] args) {
		
		
						//Exception Errors
		
		
//		System.out.println(10/0);		//ArithmeticException
		
//		int a[] = {10,2,3};
//		System.out.println(a[10]);		//ArrayIndexOutofBoundException
		
//		ArrayList <Integer> a = new ArrayList<Integer>();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		System.out.println(a.get(8));	//IndexOutOfBoundsException
		
		
//		Scanner io = new Scanner(System.in);
//		System.out.println("Enter the number  :");
//		int a = io.nextInt();			//InputMismatchException
		
//		String s = null;
//		System.out.println(s.length()); //NullPointerException
		
		
//		String a = "asfaq";
//		a.charAt(50);					//StringIndexOutOfBoundsException
		
		
//		String b = "1234";
//		System.out.println(b+5);
//		
//		int c = Integer.parseInt(b);
//		System.out.println(c+1);
		
//		String a1 ="Abc1425376nkjhhjggdjg23r";
//		int b1 = Integer.parseInt(a1);	
//		System.out.println(b1+4);		//NumberFormatException
		
		
		
								//Exception Handling
		
//		System.out.println("Hello");
//		System.out.println("bye");
//		try{
//		System.out.println(110/0);
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number");
		try {
		int a = in.nextInt();
		}
		catch(Exception event) {
			event.printStackTrace();
		}
		System.out.println("byebye...");
	}	

}

package Project1;
import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		System.out.println("Enter the Table");
		int a = io.nextInt();
		System.out.println("Table upto  ?");
		int b = io.nextInt();
		
		for(int i=1; i<=b; i++) {
			int c = a * i;
			System.out.println(a + "*" + i + "*" + "=" + c);
		}
	}

}

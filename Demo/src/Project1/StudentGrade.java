package Project1;
import java.util.Scanner;
public class StudentGrade {

	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);
		System.out.println("Enter Your Mark");
		int Mark = io.nextInt();
		
		if(Mark <= 100 && Mark >=90 ) {
			System.out.println("Your Grade is 'O' ");
		}
		else if( Mark<= 89 && Mark >=80) {
			System.out.println("Your Grade is 'A' ");
		}
		else if( Mark <= 79 && Mark >=70) {
			System.out.println("Your Grade is 'B' ");
		}
		else if( Mark<= 69 && Mark >=60) {
			System.out.println("Your Grade is 'C' ");
		}
		else if( Mark<= 59 && Mark >=50) {
			System.out.println("Your Grade is 'D' ");
		}
		else if( Mark<= 49 && Mark >= 0) {
			System.out.println("You are fail");
		}
		else {
			System.out.println("Given Mark was wrong");
		}
		

	}

}

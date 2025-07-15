package Project1;

public class Factorial {

	public static void main(String[] args) {
		
		//to find factorial
//	    int fact = 1;
//	    for (int l = 1; l <= 5; l++) {
//	        fact *= l;
//	        System.out.println(fact); 
//	    }
//	    System.out.println("Factorial of 1 to 5 :  " + fact);

		
		int fact =1;
		for(int i=1; i<=5; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}

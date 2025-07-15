package Project1;
import java.util.Arrays;
public class Operator {
	public static void main(String[]args) {
		
	int a = 10;
	int b = 2;
	//Arithmetic operator
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a/b);
	System.out.println(a*b);
	System.out.println(a%b);
	
	int c = 5;
	c++;
	System.out.println(c);
	
	int d = 10;
	d--;
	System.out.println(d);
	
	//Assignment operator
	
	System.out.println(a+=30);
	System.out.println(a-=30);
	System.out.println(a/=30);
	System.out.println(a*=30);
	System.out.println(a%=30);

	int e = 17;
	int f = 30;
	//Compare operator
	System.out.println(e<f);
	System.out.println(e>f);
	System.out.println(e<=f);
	System.out.println(e>=f);
	System.out.println(e==f);
	System.out.println(e!=f);
	
    //logical operator
	System.out.println((e<f)&&(e>=f));
	System.out.println((e<f)||(e>=f));
	System.out.println(!((e>f)&&(e>=f)));
	
	//Condition operator
	
	//if else
	if(e%2==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
	
	//if else if
	if(e<17) {
		System.out.println("Not Eligible for vote");
	}
	else if(e==18){
		System.out.println("your are a first time voter");
	}
	else {
		System.out.println("Eligible for vote");
	}
	
	
	//Switch case to print a day
	
	int day=10;
	
	switch(day) {
	
	case 1:
		System.out.println("Sunday");
		break;
	case 2:
		System.out.println("monday");
		break;
	case 3:
		System.out.println("tuesday");
		break;
	case 4:
		System.out.println("wednesday");
		break;
	case 5:
		System.out.println("thursday");
		break;
	case 6:
		System.out.println("friday");
		break;
	case 7:
		System.out.println("saturday");
		break;
	case 10:
		System.out.println("hello it is a day");
	default:
		System.out.println("Not a day");
	
	}
	
	//Switch case to print a vowels
	
	char vowels = 'h';
	
	switch(vowels) {
	case 'a':
		System.out.println("a is vowels");
		break;
	case 'e':
		System.out.println("e is vowels");
		break;
	case 'i':
		System.out.println("i is vowels");
		break;
	case 'o':
		System.out.println("o is vowels");
		break;
	case 'u':
		System.out.println("u is vowels");
		break;
	default:
		System.out.println("Non are vowels");
	}
	
	//find leap year
	
	int year = 2031;
	
	if((year % 5 != 0)) {
		System.out.println("it is leap year");
	}
	else {
		System.out.println("It is not a leap year");
	}
	
	//Array
	
	String[] color = {"pink","red","white","black"};
	System.out.println(Arrays.toString(color));	
	
	System.out.println(color[2]);
	
	
	//Looping statement
	//While loop
	
	int i = 0;
	
	while(i<10) {
		i++;
		System.out.println(i);
	}
	
	//Do While loop
	
	do {
		i++;
		System.out.println(i);
	}while(i<10);
	
	//For Loop
	
	for(int j=0 ; j<=10 ; j++) {
		
		if(j==4) {
			continue;
		}
		System.out.println(j);
	}
	
	
//	//to find even and odd numbers
//	System .out.println("Print even numbers");
//	for (int even = 2; even <= 10; even += 2) {
//        System.out.print(even + " ");
//    }
//
//	System.out.println("Print odd numbers");
//	for (int odd = 1; odd <= 10; odd += 2) {
//        System.out.print(odd + " ");
//    }
	
	
	

	
	
	

	
    
	}
}
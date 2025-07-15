package Project2;

public class Fn {
	
	public static int addnumber(int x,int y) {
		return x+y;
		
	}
public static int subnumber(int x,int y) {
	return x-y;
	
}
public static void main(String args []) {
	int a=10;
	int b=20;
	int c=30;
	int d=90;
	int add = addnumber(a,c);
	int sub = subnumber (d,b);
	System.out.println(add);
	System.out.println(sub);
	
}
}
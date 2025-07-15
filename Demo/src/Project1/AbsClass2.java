package Project1;

public class AbsClass2 implements Bankss {
	public void savings() {
		System.out.println("Savings Account");
	}
	
	public void salary() {
		System.out.println("Salary Account");
	}
public static void main(String[]args) {
	AbsClass2 obj = new AbsClass2();
	obj.savings();
	obj.salary();
}
}

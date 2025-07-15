package Project1;

public class First {
private String name;
private int age;
private boolean isactive;
private String ask; 



public String getAsk() {
	return ask;
}



public void setAsk(String ask) {
	this.ask = ask;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public int getAge() {
	return age;
}



public void setAge(int age) {
	this.age = age;
}



public boolean isIsactive() {
	return isactive;
}



public void setIsactive(boolean isactive) {
	this.isactive = isactive;
}



public static void main(String[]args){
	First obj = new First();
//	obj.setName("asfaq");
	obj.setAge(19);
	obj.setIsactive(true);
//	obj.setAsk("Hello");
	
	System.out.println(obj.getName());
	System.out.println(obj.getAge());
	System.out.println(obj.isIsactive());
	System.out.println(obj.getAsk());
}
}
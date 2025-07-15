package Project1;

public class Cat {
	public void Sound() {
		System.out.println("Cat sound Meow");
	}
public static void main(String[] args) {
	Cat obj = new Cat();
	obj.Sound();
	Dog obj1 = new Dog();
	obj1.Sound();
	obj1.sound(100);
}
}
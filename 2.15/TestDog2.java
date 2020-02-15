class Animal{
	public void move(){
		System.out.println("Animal can move.");
	}
}
class Dog extends Animal{
	public void move(){
		super.move();
		System.out.println("Dog can move");
	}
}
public class TestDog2{
	public static void main(String[] args){
		Animal b=new Dog();
		b.move();
	}
}

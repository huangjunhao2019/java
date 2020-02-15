public class Dog extends Penguin{
	public Dog(String dogname,int myid){
		super(dogname,myid);
	}
	public static void main(String[] args){
		Dog dog=new Dog("huang",20163243);
		dog.eat();
		dog.sleep();
	}
}

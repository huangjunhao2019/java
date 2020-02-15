public class Mammallnt implements Animal{
	public void eat(){
		System.out.println("Mammal eats");
	}
	public void travel(){
		System.out.println("Mammal travels");
	}
	public int noOfLegs(){
		return 0;
	}
	public static void main(String[] args){
		Mammallnt m=new Mammallnt();
		m.eat();
		m.travel();
	}
}


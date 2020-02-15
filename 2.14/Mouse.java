public class Mouse{
	private String name;
	private int id;
	public Mouse(String myName,int myid){
		name=myName;
		id=myid;
	}
	public void eat(){
		System.out.println(name+" is eating");
	}
	public void sleep(){
		System.out.println(name+" is sleeping");
	}
	public void introduction(){
		System.out.println("Hello, everybody! I am "+id+"th "+name+".");
	}
}

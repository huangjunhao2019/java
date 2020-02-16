public class Box<T>{
	private T t;
	public void add(T t){
		this.t=t;
	}
	public T get(){
		return t;
	}
	public static void main(String[] args){
		Box<Integer> integerBox=new Box<Integer>();
		Box<String> stringBox=new Box<String>();
		integerBox.add(new Integer(10));
		stringBox.add(new String("HUANG Jun-Hao"));

		System.out.println("The integer is "+integerBox.get());
		System.out.println("The String is "+stringBox.get());
	}
}

public class TestArray{
	public static void main(String[] args){
		int size=10;
		double[] myList=new double[size];
		for(int i=0;i<10;i++)
			myList[i]=i;
		double total=0;
		for(int i=0;i<size;i++)
			total+=myList[i];
		System.out.println("The summary is "+total);
	}
}

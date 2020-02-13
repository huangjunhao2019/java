public class TestVoidMethod2{
	public static void nPrintln(String message,int n){
		for(int i=0;i<n;i++)
			System.out.println(message);
	}
	public static void main(String[] args){
		nPrintln("Hello, Mr Huang",100);
	}
}

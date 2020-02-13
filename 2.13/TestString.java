import java.util.Scanner;
public class TestString{
	public static void main(String[] args){
	StringBuffer sb=new StringBuffer("");
	Scanner scan=new Scanner(System.in);
	while(scan.hasNextLine())
	{
		sb.append(scan.nextLine());
	}
	System.out.println("The content is "+sb);
	scan.close();
	}
}

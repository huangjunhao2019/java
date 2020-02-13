import java.io.*;
public class CreateDir{
	public static void main(String[] args){
		String dirname="~/Desktop/hao";
		File d= new File(dirname);
	        boolean bool=d.mkdir();
		if(bool)
			System.out.println("Sucess");
		else
			System.out.println("Failed");

	}
}

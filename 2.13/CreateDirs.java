import java.io.*;
public class CreateDir{
	public static void main(String[] args){
		String dirname="~/Desktop/java/2.13/huang";
		File d=new File(dirname);
		d.mkdirs();
	}
}

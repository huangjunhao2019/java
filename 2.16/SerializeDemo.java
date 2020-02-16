import java.io.*;
public class SerializeDemo{
	public static void main(String[] args){
		Employee e=new Employee();
		e.name="Reyan ALi";
		e.address="Phokka Kuan, Ambehta Peer";
		e.SSN=1234;
		e.number=101;
		try{
			FileOutputStream fileOut=new FileOutputStream("/home/huang/Desktop/java/2.16/employee.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in ~/Desktop/java/2.16/employee.ser");
		}
		catch(IOException i){
			i.printStackTrace();
		}
	}
}

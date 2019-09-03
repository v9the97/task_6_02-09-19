import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DisplayInfo extends Employee {

	
	
	public DisplayInfo(int empno, int sal, String desg, String dept) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1=new Employee();
		FileInputStream fis;
		try {
			fis = new FileInputStream("D:/vinod/recodetask6/employeeserial.txt");
		
		ObjectInputStream ois;
		
			ois = new ObjectInputStream(fis);
		
	 
		employee1=(Employee)ois.readObject();
	
		ois.close();
		
		fis.close();
		}
		catch (Exception e)
		{
			
		}
		
		System.out.println(employee1);
	}

}

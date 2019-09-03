import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable{
	private int empno,sal;
	private String desg,dept;
	/*public Employee(int empno, int sal, String desg, String dept) {
		
		this.empno = empno;
		this.sal = sal;
		this.desg = desg;
		this.dept = dept;
	}*/
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter employye number, salary,desgination,deptartmentname");
		Employee employee=new Employee();
				employee.setEmpno(sc.nextInt()); employee.setSal(sc.nextInt()); employee.setDesg(sc.next()); employee.setDept(sc.next());
		
		
		try{
			FileOutputStream fileout=new FileOutputStream("D:/vinod/recodetask6/employeeserial.txt");
		ObjectOutputStream object=new ObjectOutputStream(fileout);
		object.writeObject(employee);
 object.close();
 fileout.close();
		}catch (IOException e) {
			// TODO: handle exception
	e.printStackTrace();
		}
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", sal=" + sal + ", desg=" + desg + ", dept=" + dept + "]";
	}

}

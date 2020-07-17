package Wrapper;

import java.util.Scanner;

class Employee implements Cloneable{
	private String name;
	private int emp_id;
	private String dept;
	public Employee(String name, int emp_id, String dept) {
		super();
		this.name = name;
		this.emp_id = emp_id;
		this.dept = dept;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", emp_id=" + emp_id + ", dept=" + dept + "]";
	}
	
}
public class Main implements Cloneable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		e.setName(sc.next());
		e.setEmp_id(sc.nextInt());
		e.setDept(sc.next());
		Employee edup=e;
		e.setName(sc.next());
		e.setDept(sc.next());
		System.out.println(e);
		System.out.println(edup);
	}

}

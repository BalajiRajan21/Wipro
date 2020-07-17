package ExceptionHandling;

import java.util.Scanner;
class InvalidMarkException extends RuntimeException{
	InvalidMarkException(String s){
		super(s);
	}
}
class Student{
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	
	public Student() {
		super();
	}
	public Student(String name, int sub1, int sub2, int sub3) {
		super();
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	
}
public class StudentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			Student s1=new Student();
			s1.setName(sc.next());
			try {
				s1.setSub1(sc.nextInt());
				s1.setSub2(sc.nextInt());
				s1.setSub3(sc.nextInt());
			}
			catch(NumberFormatException e) {
				e.printStackTrace();
			}
			Student s2=new Student();
			s2.setName(sc.next());
			try {
				s2.setSub1(sc.nextInt());
				s2.setSub2(sc.nextInt());
				s2.setSub3(sc.nextInt());
			}
			catch(NumberFormatException e) {
				e.printStackTrace();
			}
			if(s1.getSub1()>=0 && s1.getSub1()<=100 && s1.getSub2()>=0 && s1.getSub2()<=100 && s1.getSub3()>=0 && s1.getSub3()<=100) {
				System.out.println("Student 1 valid");
				System.out.println(s1.getName()+"Average Mark is :"+(s1.getSub1()+s1.getSub2()+s1.getSub3())/3);
			}
			else
				throw new InvalidMarkException("Student 1 marks is incorrect");
			if(s2.getSub1()>=0 && s2.getSub1()<=100 && s2.getSub2()>=0 && s2.getSub2()<=100 && s2.getSub3()>=0 && s2.getSub3()<=100) {
				System.out.println("Student 2 valid");
				System.out.println(s2.getName()+"Average Mark is :"+(s2.getSub1()+s2.getSub2()+s2.getSub3())/3);
			}
			else
				throw new InvalidMarkException("Student 2 marks is incorrect");
			
			
	}

}

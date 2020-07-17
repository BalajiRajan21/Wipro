package ExceptionHandling;
class ChildException extends RuntimeException{
		ChildException(String s){
			super(s);
	}
}
class SeniorcitizenException extends RuntimeException{
	SeniorcitizenException(String s){
		super(s);
}
}
public class Adult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=Integer.parseInt(args[0]);
		if(age>=18 && age<=60)
			System.out.println("Adult");
		else if(age<18)
			throw new ChildException("Child");
		else
			throw new SeniorcitizenException("Senior Citizen");                                                                                                         
	}

}

package ExceptionHandling;

import java.util.Scanner;
class InvalidCountryException extends RuntimeException{
	InvalidCountryException(String s){
		super(s);
	}
}
class registerUser{
	private String name;
	private String country;
	public registerUser(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	public registerUser() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		registerUser ru=new registerUser();
		ru.setName(sc.next());
		ru.setCountry(sc.next());
		if(ru.getCountry().equalsIgnoreCase("India")) {
			System.out.println("Valid Student");
		}
		else
			throw new InvalidCountryException("User Outside India cannot be registered");
		
	}
}

import java.util.*;
public class LastDigit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number :");
		int a=sc.nextInt();
		System.out.println("Enter the First Number :");
		int b=sc.nextInt();
		a=a%10;
		b=b%10;
		if(a==b)
			System.out.println("true");
		else
			System.out.println("false");

	}
}
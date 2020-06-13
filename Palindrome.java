import java.util.*;
public class Palindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		int k=n;
		int rev = 0; 
        while (n > 0) { 
            rev = rev * 10 + n % 10; 
            n = n / 10;
		}
		if(k==rev)
			System.out.println(k+" is a palindrome");
		else
			System.out.println(k+" is not a palindrome");
	}
}

import java.util.*;
class PalindromeCheck{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String input1=sc.next();
		StringBuffer sb=new StringBuffer(input1);
		String input2=sb.reverse().toString();
		if(input2.equalsIgnoreCase(input1)){
			System.out.println("It is Palindrome");
		}
		else
			System.out.println("it is not a Palindrome");
	}
}

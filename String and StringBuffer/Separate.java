import java.util.*;
public class Separate{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		String res=s.substring(1,s.length()-1);
		System.out.println(res);
	}
}
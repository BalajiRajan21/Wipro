import java.util.*;
public class ShortLong{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String:");
		String s=sc.next();
		int l1=s.length();
		System.out.println("Enter the Second String:");
		String t=sc.next();
		int l2=t.length();
		if(l1>l2)
			System.out.println(t+s+t);
		else
			System.out.println(s+t+s);
	}
}
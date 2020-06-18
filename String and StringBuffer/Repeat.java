import java.util.*;
class Repeat{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		int n=s.length();
		String res=s.substring(0,2);
		for(int i=0;i<n;i++)
			System.out.print(res);
	}
}

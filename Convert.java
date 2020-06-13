import java.util.*;
public class Convert{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char c=sc.next().charAt(0);
		if(c>=65 && c<=90)
			System.out.println(c+"->"+(char)(c+32));
		else if(c>=97 && c<=122)
			System.out.println(c+"->"+(char)(c-32));
		else
			System.out.println("Enter the valid Character");
	}
}

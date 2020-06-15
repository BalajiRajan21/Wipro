import java.util.*;
public class FindChar{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char c=sc.next().charAt(0);
		if(c>=48 && c<=58)
			System.out.println("Digit");
		else if(c>=65 && c<=90 || c>=97 && c<=122)
			System.out.println("Alphabet");
		else
			System.out.println("Special Character");
	}
}
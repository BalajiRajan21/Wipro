import java.util.*;
public class Reverse{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		while(n>0){
			int a=n%10;
			System.out.print(a);
			n=n/10;
		}
	}
	
}
import java.util.*;
public class CheckPrime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check:");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n;i++){
			if(n%i==0)
				count++;
		}
		if(count>1)
			System.out.print("It is Not a Prime Number");
		else
			System.out.print("It is a Prime Number");
	}
}
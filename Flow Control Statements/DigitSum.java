import java.util.*;
public class DigitSum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		int b=Integer.toString(n).length();
		int res=0;
		for(int i=b;i>0;i--){
			int a=n%10;
			res=res+a;
			n=n/10;
		}
		System.out.println(res);
	}
}
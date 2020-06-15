import java.util.*;
public class SmallLarge2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to be initalized");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements to be initalized");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
			System.out.println("The smallest two numbers are "+a[0]+" "+a[1]);
			System.out.print("The largest two numbers are "+a[a.length-2]+" "+a[a.length-1]);
	}
}
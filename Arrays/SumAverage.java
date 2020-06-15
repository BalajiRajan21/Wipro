import java.util.*;
public class SumAverage{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to be initalized");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements to be initalized");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		int avg=sum/a.length;
		System.out.println("The Sum and the Average of the array Elements is "+sum+" "+avg);
	}
}
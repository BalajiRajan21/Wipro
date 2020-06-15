import java.util.*;
public class Sum67{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to be initalized");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements to be initalized");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int count=0;
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==6){
				count=1;
				if(i==a.length-1){
					sum=sum+a[i];
				}
			}
			else if(count==1 && a[i]==7){
				count=0;
			}
			else if(count==0){
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
}
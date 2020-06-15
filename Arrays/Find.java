import java.util.*;
public class Find{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to be initalized");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements to be initalized");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to Search");
		int k=sc.nextInt();
		int res=Arrays.binarySearch(a,k);
		if(res<0)
			System.out.println("-1");
		else
			System.out.println(res);
	}
}
import java.util.*;
public class RemoveTen{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to be initalized");
		int n=sc.nextInt();
		int[] a=new int[n];
		int res[]=new int[n];
		System.out.println("Enter the elements to be initalized");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<n;i++){
			if(!(a[i]==10)){
				res[j]=a[i];
				j++;
			}
		}
			System.out.println(Arrays.toString(res));
	}
}

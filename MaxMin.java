import java.util.*;
public class MaxMin{
	public int getMax(int [] max){
			int maxi=max[0];
			for(int i=0;i<max.length;i++){
				if(max[i]>maxi){
					maxi=max[i];
				}
			}
			return maxi;
		}
		public int getMin(int [] min){
			int mini=min[0];
			for(int i=0;i<min.length;i++){
				if(mini>min[i]){
					mini=min[i];
				}
			}
			return mini;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to be initalized");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements to be initalized");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		MaxMin m=new MaxMin();
		System.out.println(m.getMax(a));
		System.out.println(m.getMin(a));
	}
}

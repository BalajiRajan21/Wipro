import java.util.*;
public class EvenOdd{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to be initalized");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] res=new int[n];
		System.out.println("Enter the elements to be initalized");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int k=a.length-1;
		int j=0;
		for(int i=0;i<n;i++){
			if(a[i]%2==0){
				res[j]=a[i];
				j++;
			}
			else{
				res[k]=a[i];
				k--;
			}
		}	
		System.out.println(Arrays.toString(res));
	}
}
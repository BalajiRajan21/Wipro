import java.util.*;
public class RemoveDuplicates{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to be initalized");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Enter the elements to be initalized");
		for(int i=0;i<n;i++){
			int k=sc.nextInt();
			int count=0;
			for(int j=0;j<=i;j++){
				if((a[j]==k)){
					count++;
				}
			}
			if(count==0){
				a[i]=k;
			}
		}
		int cnt=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				cnt++;
			}
		}	
		int[] res=new int[n-cnt];
		int j=0;
		for(int i=0;i<a.length;i++){
			if(!(a[i]==0)){
				res[j]=a[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(res));
	}
}
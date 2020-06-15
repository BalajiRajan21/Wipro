import java.util.*;
public class OneFour{
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
		for(int x:a){
			if(!(x==1 || x==4)){
				count++;
				break;
			}
		}
		if(count>0)
			System.out.println("false");
		else
			System.out.println("true");
	}
}
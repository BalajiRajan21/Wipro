package ExceptionHandling;
import java.util.*;
public class AccesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number elements in the array");
		int m=sc.nextInt();
		System.out.println("Enter the elements in a array");
		int[] n=new int[m];
		for(int i=0;i<m;i++)
			n[i]=sc.nextInt();
		System.out.println("Enter the index of the array element you want to access");
		int k=sc.nextInt();
		try {
			System.out.println("the array element at index "+k+" = "+n[k]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}


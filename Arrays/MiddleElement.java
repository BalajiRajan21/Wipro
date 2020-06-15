import java.util.*;
public class MiddleElement{
	int[] res=new int[2];
	public int[] middleWay(int[] a1,int[] b1){
		res[0]=a1[1];
		res[1]=b1[1];
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[3];
		int[] b=new int[3];
		System.out.println("Enter the elements to be initalized for Array a");
		for(int i=0;i<3;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements to be initalized for Array b");
		for(int i=0;i<3;i++){
			b[i]=sc.nextInt();
		}
		MiddleElement m=new MiddleElement();
		System.out.println(Arrays.toString(m.middleWay(a,b)));
	}	
}
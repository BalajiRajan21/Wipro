import java.util.*;
public class RepeatString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		String[] s1=s.split(",");
		StringBuffer sb=new StringBuffer();
		int k=Integer.parseInt(s1[1]);
		for(int i=k;i>=1;i--){
			sb.append(s1[0].charAt(s1[0].length()-i));
		}
		String res=sb.toString();
		for(int i=1;i<=k;i++){
			System.out.print(res);
		}
	}
}
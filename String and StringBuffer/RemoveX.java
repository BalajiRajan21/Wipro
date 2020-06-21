import java.util.*;
public class RemoveX{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)=='x'){
				sb.deleteCharAt(i);
			}
		}
		String res=sb.toString();
		System.out.println(res);
	}
}
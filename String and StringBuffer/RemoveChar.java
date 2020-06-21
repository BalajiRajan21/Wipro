import java.util.*;
public class RemoveChar{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		String res=null;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='*'){
				res=s.substring(0,i-1)+s.substring(i+2);
				break;
			}
		}
		System.out.println(res);
	}
}
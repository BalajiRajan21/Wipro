import java.util.*;
public class Join{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		String[] s1=s.split(",");
		s=s1[0];
		String t=s1[1];
		int l1=s.length();
		int l2=t.length();
		StringBuffer sb=new StringBuffer();
		if(l1>=l2){
			for(int i=0;i<l2;i++){
				sb.append(s.charAt(i));
				sb.append(t.charAt(i));
			}
			sb.append(s.substring(l2));
		}
		else{
			for(int i=0;i<l1;i++){
				sb.append(s.charAt(i));
				sb.append(t.charAt(i));
			}
			sb.append(t.substring(l1));
		}
		String res=sb.toString();
		System.out.println(res);
	}
}
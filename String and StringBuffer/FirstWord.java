import java.util.*;
class FirstWord{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		StringBuffer sb=new StringBuffer();
		int count=0;
		char[] c=s.toCharArray();
		for(char x:c){
			if(x>=65 && x<=90){
				count++;
			}
			if(count<2){
				sb.append(x);
			}
			else{
				break;
			}
		}
		if(count==2)
			System.out.println(sb);
		else
			System.out.println("null");
	}
}
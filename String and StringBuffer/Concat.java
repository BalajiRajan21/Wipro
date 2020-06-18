import java.util.*;
class Concat{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		String[] s1=s.split(",");
		if(s1[0].charAt(s1[0].length()-1)==s1[1].charAt(0)){
			s1[1]=s1[1].substring(1);
			for(String x:s1)
				System.out.print(x.toLowerCase());
		}
		else
			for(String x:s1)
				System.out.print(x.toLowerCase()+" ");
		 
	}
}
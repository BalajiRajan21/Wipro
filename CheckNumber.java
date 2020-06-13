import java.io.*;
public class CheckNumber{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number to check:");
		int x=Integer.parseInt(br.readLine());
		if(x<0)
			System.out.println("The Number is Negative");
		else if(x==0)
			System.out.println("The Number is Zero");
		else
			System.out.println("The Number is Positive");
	}
}

import java.io.*;
public class OddEven{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number to check:");
		int x=Integer.parseInt(br.readLine());	
		if(x%2==0)
			System.out.println("The Number is EVEN");
		else
			System.out.println("The Number if ODD");
	}
}
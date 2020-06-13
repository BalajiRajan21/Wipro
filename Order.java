import java.io.*;
public class Order{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the First Character :");
		char a=br.readLine().charAt(0);
		System.out.println("Enter the First Character :");
		char b=br.readLine().charAt(0);
		if(a<b)
			System.out.println(a+","+b);
		else
			System.out.println(b+","+a);
	}
}

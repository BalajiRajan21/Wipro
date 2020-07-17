package Wrapper;

import java.util.Scanner;

public class BinaryDigit {
	public static void main(String[] ar) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//String ans=String.format("%016d",Integer.toBinaryString(n) );
		System.out.format("%0"+ (8 - Integer.toBinaryString(n).length() )+"d%s",0 ,Integer.toBinaryString(n) );
	}
}

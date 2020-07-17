package Wrapper;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=Integer.parseInt(args[1]);
		System.out.println("Given Number: "+i);
		System.out.println("Binary Equivalent: "+Integer.toBinaryString(i));
		System.out.println("Octal Equivaent: "+Integer.toOctalString(i));
		System.out.println("Hexa decimal Equivalent: "+Integer.toHexString(i));
	}

}

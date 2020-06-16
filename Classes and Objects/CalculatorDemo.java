class Calculator{
	public static double powerInt(int num1,int num2){
		return Math.pow(num1,num2);
	}
	public static double powerDouble(double num1,int num2){
		return Math.pow(num1,num2);
	}
}
public class CalculatorDemo{
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.powerInt(10,2));
		System.out.println(c.powerDouble(2.5D,2));
	}
}
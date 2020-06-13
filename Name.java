public class Name{
	public static void main(String[] args) {
		if(args.length==1)
			System.out.println("Welcome "+args[0]);
		else if(args.length==2)
			System.out.println("Welcome "+args[0]+" "+args[1]);
		else
			System.out.println("Enter the proper name");
	}
}

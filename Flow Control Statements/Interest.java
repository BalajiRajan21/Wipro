public class Interest{
	public static void main(String[] args) {
		if(args.length==2){
		if(args[0].equals("Female")){
			int age=Integer.parseInt(args[1]);
			if(age>=1 && age<=58)
				System.out.println("Interest Rate:8.2%");
			else if(age>=59 && age<=100)
				System.out.println("Interest Rate:9.2%");
		}
		else if(args[0].equals("Male")){
			int age=Integer.parseInt(args[1]);
			if(age>=1 && age<=58)
				System.out.println("Interest Rate:8.4%");
			else if(age>=59 && age<=100)
				System.out.println("Interest Rate:10.5%");
		}
		}
		else
			System.out.println("Enter the Correct Values");
	}
}

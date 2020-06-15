public class Arguments{
	public static void main(String[] args) {
		if(args.length>1){
			for(int i=0;i<args.length;i++){
				if(i==args.length-1){
					System.out.print(args[i]);
					break;
				}
				System.out.print(args[i]+",");
			}
		}
		else
			System.out.print("No Values");
	}
}
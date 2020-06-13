public class StarDisplay{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int j=1;
		while(n>=j){
			for(int i=1;i<=j;i++){
				System.out.print("* ");
			}
			System.out.println();
			j++;
		}

	}
}

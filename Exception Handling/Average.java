package ExceptionHandling;
public class Average {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
			try {
				arr[i]=Integer.parseInt(args[i]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.exit(0);
			}
		int sum=0;
		for(int i=0;i<5;i++)
			sum=sum+arr[i];
		System.out.println("Total :"+sum);
		double avg=(sum/5.0);
		System.out.println("Average: "+avg);
	}

}

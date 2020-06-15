public class HighestNumber{
	public static void main(String[] args) {
		int[][] a=new int[3][3];
		if(args.length<9){
			System.out.println("Please enter 9 integer numbers");
		}
		else{
			int k=0;
			int high=0;
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					a[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			System.out.println("The Given Array is:");
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(high<a[i][j]){
						high=a[i][j];
					}
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The biggest number in the given array is "+high);
		}
	}
}

import java.util.Scanner;

class OddPattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length:");
		int s=sc.nextInt();
		int[] oddnum=new int[s];
		System.out.print("Enter times for printing:");
		int l=sc.nextInt();
		for (int i=0; i<s; i++){
			System.out.print("Enter your number "+(i+1)+":");
			oddnum[i]=sc.nextInt();

		}
		System.out.println();
		for (int z=0; z<l; z++){
			for (int j=0; j<s; j++){
				int mod=(oddnum[j]%2);
				if (mod==1){
				System.out.print(oddnum[j]);
				int e=j;
				j=s;
					for (int k=e+1; k<s; k++){
						mod=(oddnum[k]%2);
						if (mod==1){
							System.out.print("*");
							System.out.print(oddnum[k]);
						}
					
					}
				}
			}
			System.out.println();
		}
	}
}
import java.util.Scanner;

class NumberPyramid{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num;
		int y;
		int k=1;
		System.out.print("Enter your number:");
		num=sc.nextInt();
		y=1;

			while (y<=num){
				int o=1;
				int n=(num-k);
				while (n>0){
					System.out.print(" ");
					n--;
				}
				while(o<=k){

					System.out.print(o+" ");
					o++;
				}
				System.out.println();
				k++;
				y++;

		    }
		
	}
}



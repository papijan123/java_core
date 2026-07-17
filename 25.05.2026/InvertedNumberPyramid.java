import java.util.Scanner;

class InvertedNumberPyramid{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num;
		int y;
		System.out.print("Enter your number:");
		num=sc.nextInt();
		y=num;
		if ((num>=y)&&(y>0)){
			for (int i=y; 1<=i; i--){
				for (int k=y; num>k; k++){
					System.out.print(" ");
				}
				for (int j=1; j<=y; j++){
					System.out.print(j+" ");
				}
				y--;
				System.out.println();
			}
		}	
		
	}
}


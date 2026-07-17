import java.util.Scanner;

class SameNumberTriangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num;
		int y;
		System.out.print("Enter your number:");
		num=sc.nextInt();
		y=1;
		if (num>=y){
			for (int i=(y); num>=i; i++){
				for (int j=1; j<=i; j++){
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}	
		
	}
}
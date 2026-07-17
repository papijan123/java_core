import java.util.Scanner;

class Diamond{
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
				if (y<(num*0.75)){
					k++;
					y++;
					n--;
					o++;
				}else{
					while (n>0){
						System.out.print(" ");
						n--;
					}
					while(o<=k){
						System.out.print("* ");
						o++;
					}
					System.out.println();
					k++;
					y++;
				}
		    }
			
		y=(num-1);
		if ((num>=y)&&(y>0)){
		for (int i=y; 1<=i; i--){
			for (int x=y; num>x; x++){
				System.out.print(" ");
			}
			for (int j=1; j<=y; j++){
				System.out.print("* ");
			}
			y--;
			System.out.println();
			}
		}
			
		
	}
}
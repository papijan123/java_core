import java.util.Scanner;

class large_three_numbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.print("Enter the first number:");
		num1=sc.nextInt();
		System.out.print("Enter the second number:");
		num2=sc.nextInt();
		System.out.print("Enter the third number:");
		num3=sc.nextInt();
		if (num1>num2){
			if (num1>num3){
				System.out.println("Largest number is:"+num1);
			}else{
				System.out.println("Largest number is:"+num3);
			}
		}else if (num2>num3){
			System.out.println("Largest number is:"+num2);
		}else{
			System.out.print("Largest number is:"+num3);
		}
			
	}
	
}
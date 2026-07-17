 import java.util.Scanner;

class SimpleCalculator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=0;
		int Result;
		System.out.print("Enter First Number:");
		num1=sc.nextInt();
		System.out.print("Enter Second Number");
		num2=sc.nextInt();
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		System.out.print("Select Your Number:");
		int Sel=0;
		Sel=sc.nextInt();
		switch (Sel){
			case 1:
				Result=num1+num2;
				System.out.println("Result"+Result);
				break;
			case 2:
				Result=num1-num2;
				System.out.println("Result"+Result);
				break;
				
			case 3:
				Result=num1*num2;
				System.out.println("Result"+Result);
				break;
			case 4:
				if ((num2==0)&&(num1==0)){
					System.out.println("Undefine");
				}else if (num2==0){
					System.out.println("Infinite");
				}else{
					Result=num1/num2;
					System.out.println("Result"+Result);	
				}
				break;
			default:
				System.out.println("Please Enter A Correct Number");
				break;	
		}
		
	}
}
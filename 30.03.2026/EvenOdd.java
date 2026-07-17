import java.util.Scanner;

class EvenOdd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num;
		int mod;
		System.out.print("Enter a number:");
		num=sc.nextInt();
		mod=num%2;
		if ((mod==1)||(mod==-1)){
			System.out.println("Number is odd");
		}else{
			System.out.println("Number is even");
		}
	}
} 
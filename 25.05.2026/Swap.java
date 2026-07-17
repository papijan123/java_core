import java.util.Scanner;

class Swap{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		int x;
		int y;
		System.out.print("Enter value of a:");
		a=sc.nextInt();
		System.out.print("Enter value of b:");
		b=sc.nextInt();
		x=a;
		y=b;
		System.out.println("Before Swap	"+"a="+a+"	b="+b);
		a=y;
		b=x;
		System.out.println("After Swap	"+"a="+a+"	b="+b);
	}
}
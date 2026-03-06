 import java.util.Scanner;

class UserInput{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String name="";
		System.out.print("please enter your name:");
		name=scan.next();
		System.out.println("Your name is:"+name);
		System.out.println("******************************************");
		int marks=0;
		System.out.println("please enter your marks:");
		marks=scan.nextInt();
		System.out.println("Your marks is "+marks);
	}
}
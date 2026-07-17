import java.util.Scanner;

class UserInput{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.print("Enter Your Name:"); 
		name=sc.next();
		System.out.println("Your Name Is:"+name);
		int marks;
		System.out.print("Enter Your Marks:");
		marks=sc.nextInt();	
		System.out.println("Your Marks Is:"+marks);
	
	}
}
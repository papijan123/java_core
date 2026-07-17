import java.util.Scanner;

class password_checker{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int password=1234;
		int pass;
		boolean x=true;
		int i=3;
		
		while (x){

			if ((i<=3)&&(i>=1)){
				System.out.print("Enter your password:");
				pass=sc.nextInt();				
				if (pass==password){
					System.out.println("Login successfull");
					x=false;
				}else{
					System.out.println("password incorrect");
					i-=1;
					System.out.println("("+i+")"+"attempts left");
				}
			}else{
				System.out.println("login failed");
				x=false;
			}
			
		}
		
		
		
	}
}
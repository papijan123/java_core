import java.util.Scanner;

class Atm{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int dep;
		int bal=10000;
		int wit;
		int opt;
		String ope;
		boolean x=true;

		while (x==true){
			boolean z=true;
			boolean k=true;
			System.out.println("---ATM MENU---");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
		
		

			System.out.print("Choose optin:");
			opt=sc.nextInt();
			switch (opt){
				case 1:
					System.out.println("Your balance:"+bal);
					while (z==true){
						System.out.print("Do you want another operation? (y/n):");
						ope=sc.next();
						if (ope.equals("y")){
							x=true;
							z=false;
						}else if (ope.equals("n")){
							x=false;
							z=false;
							System.out.println("Thank you have a good day");
						}else{
							System.out.println("Please enter (y/n)");
							z=true;
						}
					}
					break;
				case 2:
					System.out.print("Enter deposit amount:");
					dep=sc.nextInt();
					bal=bal+dep;
					System.out.println("Updated balance:"+bal);
					while (z==true){
						System.out.print("Do you want another operation? (y/n):");
						ope=sc.next();
						if (ope.equals("y")){
							x=true;
							z=false;
						}else if (ope.equals("n")){
							x=false;
							z=false;
							System.out.println("Thank you have a good day");
						}else{
							System.out.println("Please enter (y/n)");
							z=true;
						}
					}
					break;
				case 3:
					while (k==true){
						System.out.print("Enter withdrawal amount:");
						wit=sc.nextInt();
						if (bal>=wit){
							bal=bal-wit;
							System.out.println("Updated balance:"+bal);
							k=false;
						}else{
							System.out.println("You dont have enough balance");
							k=true;
						}
					}
					while (z==true){
						System.out.print("Do you want another operation? (y/n):");
						ope=sc.next();
						if (ope.equals("y")){
							x=true;
							z=false;
						}else if (ope.equals("n")){
							x=false;
							z=false;
							System.out.println("Thank you have a good day");
						}else{
							System.out.println("Please enter (y/n)");
							z=true;
						}
					}
					break;

				default:
					x=true;
					System.out.println("Please enter a valid number");
					
		}

				
		}
		
		
		
	}
}                                                                      
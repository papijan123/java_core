import java.util.Scanner;

class shop_bill{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int price;
		int quantity;
		System.out.print("Enter item price:");
		price=sc.nextInt();
		System.out.print("Enter item quantity:");
		quantity=sc.nextInt();
		double tot=price*quantity;
		if (tot>5000){
			System.out.println("Discount applied (10%)");
			tot=(tot)-(tot*0.1);
		}
		System.out.println("Total Bill Amount:"+tot);
		
		
		
	}
}
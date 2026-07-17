import java.util.Scanner;

class multiplication{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num1=0;
		boolean x=true;
		while (x){
			System.out.print("Enter A Number:");
			num1=sc.nextInt();
			if (num1>0){
				x=false;	
			}else{
				System.out.println("Enter a positive number");
				x=true;
			}
		
		}
		for(int i=0; i<11; i+=1){
			int v;
			v=num1*i;
			System.out.println(num1+"*"+i+"="+v);
			
			
			
		}
		
		
		
		
	}
	
	
}
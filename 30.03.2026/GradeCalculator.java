import java.util.Scanner;

class GradeCalculator{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	boolean x=true;
	int num1;
	int num2;
	int num3;
	int tot=0;
	int avg;
	while (x==true){
		System.out.print("Enter marks for subject 1:");
		num1=sc.nextInt();
		if ((num1>=0)&&(num1<=100)){
			x=false;
			tot=tot+num1;
		}else{
			x=true;
			System.out.println("Enter a valid number");
		}
		
	}
	x=true;
	while (x==true){
		System.out.print("Enter marks for subject 2:");
		num2=sc.nextInt();
		if ((num2>=0)&&(num2<=100)){
			x=false;
			tot=tot+num2;
		}else{
			x=true;
			System.out.println("Enter a valid number");
		}
		
	}
	x=true;
	while (x==true){
		System.out.print("Enter marks for subject 3:");
		num3=sc.nextInt();
		if ((num3>=0)&&(num3<=100)){
			x=false;
			tot=tot+num3;
		}else{
			x=true;
			System.out.println("Enter a valid number");
		}
		
	}
	avg=tot/3;
	
	if (avg>=75){
		char Grade='A';
		System.out.println("Grade:"+Grade);
	}else if (avg>=65){
		char Grade='B';
		System.out.println("Grade:"+Grade);
	}else if (avg>=55){
		char Grade='C';
		System.out.println("Grade:"+Grade);
	}else if (avg>=45){
		char Grade='S';
		System.out.println("Grade:"+Grade);
	}else{
		char Grade='F';
		System.out.println("Grade:"+Grade);
	}
	
	}
}
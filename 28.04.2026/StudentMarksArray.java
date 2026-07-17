import java.util.Scanner;

class StudentMarksArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int subnum;
		int[] stm;
		int mark;
		int tot=0;
		int avg;
		System.out.print("Input subject counts:");
		subnum=sc.nextInt();
		stm=new int[subnum];
		for (int i=0; i<subnum; i++){
			boolean x=true;
			while (x){
				System.out.print("Input mark"+(i+1)+":");
				mark=sc.nextInt();
				if ((mark<=100)&&(mark>=0)){
					x=false;
				}else{
					System.out.println("please enter a valid mark");
					x=true;
				}
				stm[i]=mark;
			}
		}
		for (int j=0; j<subnum; j++){
			tot+=stm[j];
		}
		avg=tot/subnum;
		System.out.println("Your total is:"+tot);
		System.out.println("Your avarage is:"+avg);
		
		
		
	}
	
}
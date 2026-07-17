import java.util.Scanner;

class AltNumStarPattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
        long count=sc.nextLong();
        for(int i=1; i<=count; i++){
            for(int j=1; j<6; j++){
                if((i)%2==0){
                    System.out.print("*");
                    if(i>10){
                        System.out.print("*");
                        if(i>100){
                            System.out.print("*");
                            if(i>1000){
                                System.out.print("*");
                                if(i>10000){
                                    System.out.print("*");
                                    if(i>100000){
                                        System.out.print("*");
                                        if(i>1000000){
                                            System.out.print("*");
                                            if(i>10000000){
                                                System.out.print("*");
                                                if(i>100000000){
                                                    System.out.print("*");
                                                    if(i>1000000000){
                                                        System.out.print("*");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
            
        }
        

		
	}
}

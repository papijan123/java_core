class Elifmark2{
	public static void main(String args[]){
		int marks=70;
		if((marks>=75)&&(marks<=100)){
			System.out.println("A");
		}else if (marks>=65){
			System.out.println("B");
		}else if (marks>=55){
			System.out.println("c");
		}else if (marks>=45){
			System.out.println("S");
		}else if ((marks<=45)&&(marks>=0)){
			System.out.println("F");
		}else{
			System.out.println("Input a valid number");
		}
	}
}
class Elifmark{
	public static void main(String args[]){
		int marks=70;
		if (marks<=100&&marks>=0){
			if (marks>=75){
				System.out.println("A");
			}else if (marks>=65){
				System.out.println("B");
			}else if (marks>=55){
				System.out.println("c");
			}else if (marks>=45){
				System.out.println("S");
			}else{
				System.out.println("F");
			}
		}else{
			System.out.println("enter the correct value");
		} 	
	}
}
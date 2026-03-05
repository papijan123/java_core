class NestedDoWhile{
	public static void main(String args[]){
		int x=1;
		
		
		
		do{
			int y=1;
			do{
				System.out.print(y);
				y++;
			}while (y<=3);
			
			System.out.println(x);
			x++;
		}while (x<=5);
		
	}
}
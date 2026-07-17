class twodarray{
	public static void main(String args[]){
		int[][] x=new int[5][2];
		x[0][0]=12;
		x[0][1]=13;
		x[1][0]=23;
		x[1][1]=24;
		x[2][0]=12;
		x[2][1]=13;
		x[3][0]=56;
		x[3][1]=57;
		x[4][0]=20;
		x[4][1]=21;
		for (int i=0; i<5;i++){
			for (int y=0; y<2;y++ ){
				System.out.println("X"+"["+i+"]"+"["+y+"]"+":"+x[i][y]);
				
			}
			System.out.println();	
		
		}
		
		
		
	}
	
}
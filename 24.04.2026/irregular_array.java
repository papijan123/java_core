class irregular_array{
	public static void main(String args[]){
		int[][] y=new int[5][];
		y[0]=new int[2];
		y[1]=new int[3];
		y[2]=new int[1];
		y[3]=new int[5];
		y[4]=new int[4];
		
		y[0][0]=10;
		y[0][1]=20;
		
		y[1][0]=30;
		y[1][1]=40;
		y[1][2]=50;
		
		y[2][0]=60;
		
		y[3][0]=70;
		y[3][1]=80;
		y[3][2]=90;
		y[3][3]=10;
		y[3][4]=16;
		
		y[4][0]=56;
		y[4][1]=26;
		y[4][2]=23;
		y[4][3]=57;
		
		
		
		for (int i=0; i<5;i++){
			System.out.println("Student"+(i+1));
			for (int j=0; j<y[i].length; j++ ){
				
				System.out.println("Marks:"+(j+1)+":"+y[i][j]);
				
			}
			System.out.println("************");
			
				
		
		}
		
	}
}



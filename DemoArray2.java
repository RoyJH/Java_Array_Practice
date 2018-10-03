public class DemoArray2{

//Messing with multidimensional arrays
	
	public static void main (String[] args){
	double[][] position = new double [4][4];
	
		position[0][0] =0.1;
		position[0][1] =0.2;
		position[0][2] =0.3;
		position[0][3] =0.4;
		position[1][0] =0.5;
		position[1][1] =0.6;
		position[1][2] =0.7;
		position[1][3] =0.8;
		position[2][0] =0.9;
		position[2][1] =1.0;
		position[2][2] =1.1;
		position[2][3] =1.2;
		position[3][0] =1.3;
		position[3][1] =1.4;
		position[3][2] =1.5;
		position[3][3] =1.6;
		
		System.out.println("position one by one are:");
		for (int x=0; x<4; x++){
			for (int y=0; y<4; y++){
				System.out.println(position[x][y]);
			}
		}
		
	}
}
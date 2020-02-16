package arrays;

public class MultiDimentionArray {

	public static void main(String[] args) {
		System.out.println("-----------Method 1-----------");
		int [][] myArray= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(myArray[i][j]);
			}
			System.out.println("");
		}
		System.out.println("-----------Method 2-----------");
		int[][] my2DArray = new int[4][3];
		my2DArray[0][0]=1;
		my2DArray[0][1]=2;
		my2DArray[0][2]=3;
		my2DArray[1][0]=4;
		my2DArray[1][1]=5;
		my2DArray[1][2]=6;
		my2DArray[2][0]=7;
		my2DArray[2][1]=8;
		my2DArray[2][2]=9;
		my2DArray[3][0]=10;
		my2DArray[3][1]=11;
		my2DArray[3][2]=12;

		int row=4,column=3;
		
		for (row=0;row<4;row++) {
			for (column=0;column<3;column++) {
				System.out.print(my2DArray[row][column]+" ");
			}
			System.out.println("");
		}
	}
}

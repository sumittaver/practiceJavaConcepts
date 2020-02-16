package patterns;

import java.lang.reflect.Array;
import java.util.Scanner;

public class pattern {
	//Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("\n============== Prog.1 ===============\n");
		/*
		O X O X O X O 
		X O X O X O X 
		O X O X O X O 
		X O X O X O X 
		O X O X O X O 
		X O X O X O X 
		O X O X O X O 
		*/
		// Pattern1 Start
		int size = 7;
	
		for (int j=0;j<size;j++) {
			for (int i=0;i<size;i++) {
				if((i+j)%2==0) 
				{
					System.out.print("O ");
				}else {
					System.out.print("X ");
				}
			}
			System.out.print("\n");
		}	
		// Pattern1 End
		System.out.println("\n============== Prog.2 ===============\n");
		/*
		* * * * * * * * * 
		* *   * * * * * 
		  *   * * * * * 
		  *   * * *   * 
		      * * *   * 
		      * *     * 
		      * *     * 
		      *       * 
		              * 
		              * 
		              *
		 * */
		// Pattern 2 Start
		int maxNum;
		int arr[] = {8,2,4,1,13,7,5,3};
		System.out.print("Length of array: "+arr.length+"\nValues in Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		
		for (int i=0;i<arr.length-1;i++) {
			if (arr[i]>arr[i+1]) {
				int tmp=arr[i+1]; // small value in tmp
				arr[i+1]=arr[i];  // large value
				arr[i]=tmp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		maxNum=Array.getInt(arr, arr.length-1);
		System.out.print("\nMax number in array: "+maxNum+"\n\n");
		
		
		for (int j=0;j<maxNum;j++) {
			for (int i=0;i<arr.length;i++) {
				if (j>=arr[i]) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.print("\n");
		}
		// Pattern 2 End
		
		System.out.println("\n============== Prog.3 ===============\n");
		
		// Pattern 3 Start
		
		// Find missing value without using sorting
		int arr2[] = {4,5,10,2,9,3,1,11,6,8};
		int total=0;
		for (int i=0;i<arr2.length;i++) {
			total=total+arr2[i];
		}
		System.out.print("Array size: "+arr2.length+" & Array sum is: "+total);
		
		// Pattern 3 End
		System.out.println("\n============== Prog.4 ===============\n");
		// Pattern 4 Start
		/*
		 *
		 **
		 ***
		 ****
		 ******
		 * */
		int range=5;
		for (int i=0;i<range;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		// Pattern 4 End
		System.out.println("\n============== Prog.5 ===============\n");
		// Pattern 5 Start
		/*
		         *
		       * *
		     * * *
		   * * * *
		 * * * * *
		 * */
		int prog5Length=5;
		for (int i=1;i<=prog5Length;i++) {
			for (int j=4;j>=i;j--) {
				System.out.print("  ");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			
			System.out.println("");
		}
		
		// Pattern 5 End
		System.out.println("\n============== Prog.6 ===============\n");
		/*
		    *
		   * *
		  * * *
		 * * * * 
		* * * * *
		 * * * *
		  * * *
		   * *
		    * 
		 * */
		// Pattern 6 Start
		int prog6Size=15;
		for(int i=1;i<=prog6Size/2;i++) {
			for(int j=(prog6Size/2)-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println("");	
		}
		for(int i=1;i<=(prog6Size/2)-1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=(prog6Size/2)-1;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println("");	
		}
		// Pattern 6 End
		
		System.out.println("\n============== Prog.7 ===============\n");
		/*
		 * Print integer line using 2D array, Ex.
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * */
		// Pattern 7 Start
		int row=5,col=1;
		int[][] my2DArray=new int[row][col];
		my2DArray[0][0]=1;
		my2DArray[1][0]=2;
		my2DArray[2][0]=3;
		my2DArray[3][0]=4;
		my2DArray[4][0]=5;
		for(int i=0;i<row;i++) {
			System.out.println(my2DArray[i][0]);
		}
		// Pattern 7 End
		
		System.out.println("\n============== Prog.8 ===============\n");
		/*
		           *
                 *
               *
             *
           *
		* */
		// Pattern 8 Start
		int prog8Size=5;
		for (int m=1;m<=prog8Size;m++) {
			for (int i=prog8Size-1;i>m-1;i--) {
				System.out.print("  ");
			}System.out.print(" *\n");
		}
		// Pattern 8 End
		
		System.out.println("\n============== Prog.9 ===============\n");
		// Pattern 9 Start
		
		// Pattern 9 End
		
		System.out.println("\n============== Prog.10 ===============\n");
		// Pattern 10 Start
		
		// Pattern 10 End
		
	}
}

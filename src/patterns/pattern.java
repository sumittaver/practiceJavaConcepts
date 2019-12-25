package patterns;

import java.lang.reflect.Array;
import java.util.Scanner;

public class pattern {
	//Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
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
		System.out.println("\n==============================\n");
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
		
		System.out.println("\n==============================\n");
		
		// Pattern 3 Start
		
		// Find missing value without using sorting
		int arr2[] = {4,5,10,2,9,3,1,11,6,8};
		int total=0;
		for (int i=0;i<arr2.length;i++) {
			total=total+arr2[i];
		}
		System.out.print("Array size: "+arr2.length+" & Array sum is: "+total);
		
		// Pattern 3 End
		System.out.println("\n==============================\n");
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
		System.out.println("\n==============================\n");
		// Pattern 5 Start
		/*
		      *
		     **
		    ***
		   ****
		  ******
		 * */
		int range2=5;
		for (int i=5;i>=range;i--) {
			for (int j=5;j>=range;j--) {
				if(j>=range2) {
					System.out.print("* ");
				}else {
					System.out.print("_ ");
				}
				
			}
			
			System.out.println("");
		}
		
		// Pattern 5 End
		System.out.println("\n==============================\n");
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
		// Pattern 6 End
		System.out.println("\n==============================\n");
		// Pattern 6 Start
		// Pattern 6 End
		System.out.println("\n==============================\n");
	}
}

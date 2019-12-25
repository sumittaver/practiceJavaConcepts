package arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {3,5,4,6,7,9,5};
		System.out.println("Actual sequence of array: ");
		for(int i=0;i<myArray.length;i++)
		{
			System.out.print(myArray[i]);			
		}
		int b=myArray.length-1;
		for (int a=0;a<myArray.length/2;a++) {
			//for (int b=myArray.length-1;b<myArray.length/2;b--) {
			int tmp=myArray[a];
			myArray[a]=myArray[b];
			myArray[b]=tmp;
			b=b-1;
		}
		System.out.println("\nSequence after reverse:");
		for(int i=0;i<myArray.length;i++) {
			System.out.print(myArray[i]);
		}
		
	}

}

package problems;

import java.util.Scanner;

public class ArnstrongNumber {

	public static void main(String[] args) {
		// Armstrong number Ex. 1,2,3,4,5,6,9,n*n*n + c*c*c + i*i*i=nci
		
		int input;
		int inputValues[]= {5,4,7,1};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the input to find out the number is armstrong: ");
		input=scanner.nextInt();
		if (input>9) {
			int i=0;
			while(input>0){
				inputValues[i]=input%10;
				input=input/10;
				i++;
			}
			for(int j=0;j<inputValues.length;j++) {
				System.out.println("Array values"+inputValues[j]);
			}
		}else {
			System.out.println("Value is armstrong.");
		}
		
	}

}

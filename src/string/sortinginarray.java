package string;

import java.util.Arrays;

public class sortinginarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {73,3,53,124,49,40,444,9,5,66,341};
		System.out.println("Before sort: ");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
//		Arrays.sort(arr);
//		System.out.println("\n\nAfter sort: ");
//		for (int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+", ");
//		}
		
		System.out.println("\n\nManual sort: ");
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<i;j++) {
				if (arr[j]>arr[i]) {
					int temp=0;
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		
		}
		
		
		System.out.println("\n\nAfter sort: ");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}

}

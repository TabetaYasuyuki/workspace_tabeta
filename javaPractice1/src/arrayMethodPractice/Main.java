package arrayMethodPractice;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,4,3,5,6};
		int[] arr3 = {1,2,3,4,5,6};
		
		System.out.println(Arrays.compare(arr1,arr2));
		System.out.println(Arrays.compare(arr2, arr1));
		System.out.println(Arrays.compare(arr1, arr3));
		
		System.out.println(Arrays.mismatch(arr1,arr2));
		System.out.println(Arrays.mismatch(arr1, arr3));
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.compare(arr1, arr2));

	}

}

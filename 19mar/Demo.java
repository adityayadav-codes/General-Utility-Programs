import java.util.*;
// Removes Duplicates From Array 

// public class Demo {
	
// 	public static void main(String [] args) {

// 		int [] arr = {1,2,3,2,4,1};

// 		HashSet <Integer> set = new HashSet<>();

// 		for(int i : arr) {

// 			set.add(i);
// 		}

// 		System.out.println(set);
// 	}
// }

// Merger Arrays using simple method 

public class Demo {

	 public static void main(String[] args) {
		
		int arr1 [] = {10,20,30};
		int arr2 [] = {40,50,60};

		System.out.println("Before Merging:");
		for(int i : arr1) System.out.print(i + " ");

		System.out.println();

		for(int i : arr2) System.out.print(i + " ");
		int [] result = new int[arr1.length + arr2.length];

		// copy arr1
		for(int i =0; i < arr1.length; i++) {

			result[i] = arr1[i];
		}
		 // copy arr2
		 for(int i =0; i < arr2.length; i++) {

			result[arr1.length + i] = arr2[i];
		 }
		 System.out.println();
		System.out.println("After Merging: ");
		for(int num : result) {

			System.out.print(num + " ");
		}
	 }
}

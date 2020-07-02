
public class Driver {

/**
 * CISC 380
 * Algorithms Assignment 2
 *
 * Driver file for Max Sum Subarray and Dominant Entry in Assignment2.java
 *
 *
 * @author Daniel Taufiq
 * Due Date: 03/02/2020
 */

	public static void main(String[] args) {

		System.out.println("Maximum Subarray: ");
		// test with positive and negative numbers
		int[] array45 = {4, -6, 3, 1, 9, -8, 2, -10, 13};
		System.out.println("Expected: " + "13 " + "Actual: " + Assignment2.maxSubArray(array45));
//		// test with all positive numbers
//		int[] arr2 = {1, 3, 5, 3, 3, 6, 3};
//		System.out.println("Expected: " + "24 " + "Actual: " + Assignment2.maxSubArray(arr2));
//		// test with only negative numbers
//		int[] arr3 = {-1, -2, -3};
//		System.out.println("Expected: " + "-1 " + "Actual: " + Assignment2.maxSubArray(arr3));
//		// test with empty array (or null i'm not sure)
//		int[] arr4 = {};
//		System.out.println("Expected: " + "0 " + "Actual: " + Assignment2.maxSubArray(arr4));
//		// test with one element
//		int[] arr5 = {6, 7};
//		System.out.println("Expected: " + "13 " + "Actual: " + Assignment2.maxSubArray(arr5));


//		System.out.println("\nBruteforce Hill: ");
//		// test with positive and negative numbers
//		int[] array6 = {4, -6, 3, 1, 9, -8, 2, -10, 13};
//		System.out.println("Expected: " + "9 " + "Actual: " + Assignment2.bruteHill(array6));
//		// test with all positive numbers
//		int[] arr7 = {1, 3, 5, 3, 3, 6, 3};
//		System.out.println("Expected: " + "5 " + "Actual: " + Assignment2.bruteHill(arr7));
//		// test with only negative numbers
//		int[] arr8 = {-1, -2, -3};
//		System.out.println("Expected: " + "0 " + "Actual: " + Assignment2.bruteHill(arr8));
//		// test with empty array
//		int[] arr9 = {};
//		System.out.println("Expected: " + "0 " + "Actual: " + Assignment2.bruteHill(arr9));
//		// test with hill on right
//		int[] arr10 = {6, 7};
//		System.out.println("Expected: " + "1 " + "Actual: " + Assignment2.bruteHill(arr10));
//		// test with hill on left
//		int[] arr11 = {6, 5};
//		System.out.println("Expected: " + "0 " + "Actual: " + Assignment2.bruteHill(arr11));
//
//		System.out.println("\nDivide And Conquer Hill: ");
//		// test with positive and negative numbers
//		int[] array12 = {4, -6, 3, 1, 9, -8, 2, -10, 13};
//		System.out.println("Expected: " + "6 " + "Actual: " + Assignment2.divideAndConquerHill(array12));
//		// test with all positive numbers
//		int[] arr13 = {1, 3, 5, 3, 3, 6, 3};
//		System.out.println("Expected: " + "2 " + "Actual: " + Assignment2.divideAndConquerHill(arr13));
//		// test with only negative numbers
//		int[] arr14 = {-1, -2, -3};
//		System.out.println("Expected: " + "0 " + "Actual: " + Assignment2.divideAndConquerHill(arr14));
//		// test with empty array
//		int[] arr15 = {};
//		System.out.println("Expected: " + "0 " + "Actual: " + Assignment2.divideAndConquerHill(arr15));
//		// test with hill on right
//		int[] arr16 = {6, 7};
//		System.out.println("Expected: " + "1 " + "Actual: " + Assignment2.divideAndConquerHill(arr16));
//		// test with hill on left
//		int[] arr17 = {6, 5};
//		System.out.println("Expected: " + "0 " + "Actual: " + Assignment2.divideAndConquerHill(arr17));

		System.out.println("\nDominating Entry: ");
		// test with positive and negative numbers
		int[] array18 = {1, 3, 5, 3, 3, 6, 3};
		System.out.println("Expected: " + "6 " + "Actual: " + Assignment2.dominant(array18));
		// test with all positive numbers
		int[] arr19 = {1, 3, 3, 5, 3, 3, 6, 3};
		System.out.println("Expected: " + "3 " + "Actual: " + Assignment2.dominant(arr19));
		// test with only negative numbers
		int[] arr20 = {-1, -2, -3};
		System.out.println("Expected: " + "null" + "Actual: " + Assignment2.dominant(arr20));
		// test with empty array
		int[] arr21 = {};
		System.out.println("Expected: " + "null " + "Actual: " + Assignment2.dominant(arr21));
		// test with hill on right
		int[] arr22 = {6, 7};
		System.out.println("Expected: " + "null " + "Actual: " + Assignment2.dominant(arr22));
		// test with hill on left
		int[] arr23 = {6, 5};
		System.out.println("Expected: " + "null " + "Actual: " + Assignment2.dominant(arr23));
		//main

		int[] arr24 = {3, 3, 3, 5, 8, 3, 6, 3};
		System.out.println("Expected: " + "3 " + "Actual: " + Assignment2.dominant(arr24));
		int arr25[] = {1, 1, 1, 1, 3, 3, 3, 3, 3, 3};
		System.out.println("Expected: " + "3 " + "Actual: " + Assignment2.dominant(arr25));
		int arr26[] = {1, 1, 1, 1, 1, 1, 3, 3, 3, 3};
		System.out.println("Expected: " + "1 " + "Actual: " + Assignment2.dominant(arr26));
		int arr27[] = {1, 1, 1, 1, 1, 3, 3, 3, 3, 3};
		System.out.println("Expected: " + "null " + "Actual: " + Assignment2.dominant(arr27));

//	    // test with negative and positive numbers
		//int[] array = {4, -6, 3, 1, 9, -8, 2, -10, 13};
//	        System.out.println(Assignment2.maxSubArray(array));
//	        // test with all positive numbers
		int[] arr2 = {1, 3, 5, 3, 3, 6, 3};
//	        System.out.println(Assignment2.maxSubArray(arr2));
//	        // test with only negative numbers
		int[] arr3 = {-1, -2, -3};
//	        System.out.println(Assignment2.maxSubArray(arr3));
//	        // test with empty array (or null i'm not sure)
		int[] arr4 = {};
//	        System.out.println(Assignment2.maxSubArray(arr4));
//	        // test with one element
		int[] arr5 = {6,7};
//	        System.out.println(Assignment2.maxSubArray(arr5));
//
//		int[] arr9 = {6};
//		//System.out.println( Assignment2.dominant(array) );
//		// null
//		System.out.println( Assignment2.dominant(arr2) );
//		// 3
//		System.out.println( Assignment2.dominant(arr3) );
//		// null
//		System.out.println( Assignment2.dominant(arr4) );
//		// null
//		System.out.println( Assignment2.dominant(arr9) );
//		// 6
//		int[] arr6 = { 1,2,1,3,1,4,1,5,1,6 };
//		System.out.println( Assignment2.dominant(arr6) );
//		// null
//		int[] arr7 = { 1,2,1,3,1,4,1,5,1,6};
//		System.out.println( Assignment2.dominant(arr7) );
//		// 1
//		int[] arr8 = { 1,1,1,1,1,2,3,4,5 };
//		System.out.println( Assignment2.dominant(arr8) );
//		// 1
	}
}
	        

//	        int[] array2 = {1, 3, 5, 3, 3, 6, 3};
//	       // System.out.println(Assignment2.dominant(array2));
//
//	        System.out.println("Hill Problem: \n");
//	        System.out.println(Assignment2.divideAndConqerHill(array));
//	        //should return 4
//	        System.out.println(Assignment2.divideAndConqerHill(arr2));
//	        //should return 2
//	        System.out.println(Assignment2.divideAndConqerHill(arr3));
//	        //should return 0
//	        System.out.println(Assignment2.divideAndConqerHill(arr4));
//	        //should return 0
//	        System.out.println(Assignment2.divideAndConqerHill(arr5));
//	        //should return 6
//
//	        System.out.println("Dominating Problem: \n");
//


	        
	        
	        
	//main
	
	 
	 
	 
	 
	 
	 






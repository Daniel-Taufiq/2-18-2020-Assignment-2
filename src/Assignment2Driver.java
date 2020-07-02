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


public class Assignment2Driver {

    public static void main(String[] args){

        // test with negative and positive numbers
        int[] array = {4, -6, 3, 1, 9, -8, 2, -10, 13};
        System.out.println(Assignment2.maxSubArray(array));
        // test with all positive numbers
        int[] arr2 = {1, 3, 5, 3, 3, 6, 3};
        System.out.println(Assignment2.maxSubArray(arr2));
        // test with only negative numbers
        int[] arr3 = {-1, -2, -3};
        System.out.println(Assignment2.maxSubArray(arr3));
        // test with empty array (or null i'm not sure)
        int[] arr4 = {};
        System.out.println(Assignment2.maxSubArray(arr4));
        // test with one element
        int[] arr5 = {6};
        System.out.println(Assignment2.maxSubArray(arr5));

        int[] array2 = {1, 3, 5, 3, 3, 6, 3};
        System.out.println(Assignment2.dominant(array2));
    }//main

}
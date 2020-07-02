/**
 * CISC 380 Algorithms Assignment 2
 *
 *
 *
 * @author Daniel Taufiq
 * Due Date: 03/02/2020
 */

public class Assignment2 {

    // wrapper method
    public static int maxSubArray(int[] array) {
        if (array.length == 0) {
            return 0;
        } else if (array == null) {
            return 0;
        } else {
            return maxSubArrayRecursive(array, 0, array.length - 1);
        }
    }

    private static int maxSubArrayRecursive(int[] array, int start, int end) {
        int mid;
        int maxLeft;
        int maxRight;
        int betweenSum;

        // base case with 1 element
        if (start == end) {
            return array[start];
        }

        mid = (start + end) / 2;

        maxLeft = maxSubArrayRecursive(array, start, mid);
        maxRight = maxSubArrayRecursive(array, mid + 1, end);
        betweenSum = sumBetween(array, start, end); // find sum in between start and end

        // find the maximum value found and return it
        if (maxLeft >= maxRight && maxLeft >= betweenSum) {
            return maxLeft;
        } else if (maxRight >= maxLeft && maxRight >= betweenSum) {
            return maxRight;
        } else {
            return betweenSum;
        }
    }

    // helper method for maxSubArray problem
    private static int sumBetween(int[] array, int start, int end) {
        int computeSum = 0;

        for (int i = start; i <= end; i++) {
            // add the elements together between start and end to see if it gives larger
            // value
            computeSum += array[i];
        }

        return computeSum;
    }

    /*
     * Explanation: This brute force algorithm runs through the code multiple times
     * to find the max hill. We may find a hill but in this algorithm, we're finding
     * the max hill found. If we found a hill, store it as "max" and continue
     * through the rest of the array until we find one that's a hill and bigger than
     * the previous hill. Big-O: Most of the work is done in our general case, we
     * loop through the entire array once because we want to try all possibilities
     * and in our algorithm, we're finding the best hill. This gives us O(n).
     */
    public static int bruteHill(int[] arr) {
        int largestFound = 0;
        int indexLocation = 0;
        // SPECIAL CASE: when the size of the array is 1
        if (arr.length == 1 || arr.length == 0) {
            return 0;
        }
        // SPECIAL CASE: when size of the array is 2
        else if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                return 0;
            } else {
                return 1;
            }
        }
        // GENERAL CASE: when our size of the array is greater than 2.
        else {
            largestFound = arr[0];
            // we start and stop 1 element before the start and end
            int i = 1;
            while (i < arr.length - 1) {
                if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i] && arr[i] > largestFound) {
                    largestFound = arr[i];
                    indexLocation = i;
                }
                i++;
            }
            // here we are checking the end array to see if it's left neighbor is smaller
            // and
            // this last element is bigger than the largest we found
            if (arr[arr.length - 1] > arr[arr.length - 2] && arr[arr.length - 1] > largestFound) {
                largestFound = arr[arr.length - 1];
                indexLocation = i + 1;
            }
        }
        return indexLocation;
    }

    // wrapper method
    public static int divideAndConquerHill(int[] arr) {

        return divideAndConquerHill(0, arr.length - 1, arr);

    }

    /*
     * Analysis: this (not counting recursion) is constant work, in all cases in
     * recursive case, we call 1 recursive call on N/2 - that makes it log(N)
     * recursive calls at most times constant work because O(log n)
     */
    private static int divideAndConquerHill(int start, int end, int[] arr) {

        if (end - start <= 2) {

            if (arr.length == 1 || arr.length == 0) {
                return start;
            }

            else if (arr[start] > arr[start + 1]) {
                return start;
            } else {
                return start + 1;
            }
        }

        int mid = (end + start) / 2;

        if (arr[mid - 1] > arr[mid]) {
            return divideAndConquerHill(start, mid, arr);
        }

        else {
            return divideAndConquerHill(mid, end, arr);
        }
    }

    // wrapper method
    public static Integer dominant(int[] arr) {

        if (arr == null || arr.length == 0) {

            return null;
        }
        return dominant(arr, 0, arr.length - 1);
    }

    /*
     * Analysis: this recursive method has 2 recursive calls, giving it a log(n)
     * runtime. Then we have a for loop to count the number of times both elements
     * appear in the subarray giving us n runtime for a total runtime of O(nlog(n))
     */
    private static Integer dominant(int[] arr, int start, int end) {

        // if 2 elements and they're equal return it
        if (end - start == 1) {

            if (arr[start] == arr[start + 1]) {
                return arr[start];
            } else
                // if they aren't equal, return null
                return null;
        }

        if (end - start == 0) {

            return arr[start];
        }

        int mid = (start + end) / 2;
        Integer left = dominant(arr, start, mid);
        Integer right = dominant(arr, mid+1, end);

        // if right is not null, it means there was a dominating entry in the sub array
        if (left == null) {

            if (right == null) {
                return null;
            }
            int sum = 0;
            for(int i = 0; i < arr.length; i++)
            {
                if( right != null && arr[i] == right)
                {
                    sum++;
                }
            }
            if(sum > arr.length / 2)
            {
                return right;
            }
            else
            {
                return null;
            }
        }

        // if left is not null, there was a dominating entry in the sub array
        if (right == null) {

            if (left == null) {

                return null;
            }
            return left;
        }

        // return left/right if both elements are equal
        if (left == right) {

            return left;
        }

        else {
            // count the number of time the element appears in the sub array

            int countL = 0;
            int countR = 0;

            for (int i = start; i <= end; i++) {

                if (arr[i] == left) {
                    countL++;
                }
                if (arr[i] == right) {
                    countR++;
                }
            }

            // if left count is more than half the sub array, we want to
            // return it since it's dominating
            if (countL > mid+1) {

                return left;
            } else if (countR > mid+1) { // if left count is more than half the sub array, we want to
                // return it since it's dominating
                return right;
            } else {

                return null;
            }
        }
    }

}

package toBeCompleted;

public class ArrayService {
	/**
	 * 
	 * @param data
	 * @param item
	 * @return the first index at which target exists
	 * in array data, -1 if it doesn't
	 * 
	 * return -1 if array is null or empty.
	 */
	public static int indexOf(int[] data, int target) {
		return -100; //-100 is just a placeholder to satisfy the "contract", to be completed
	}
	
	/**
	 * 
	 * @param data
	 * @param item
	 * @return the number of times target appears in the array data
	 * 
	 * return 0 if array is null or empty.
	 */
	public static int countOccurrences(int[] data, int target) {
		return -100; //-100 is just a placeholder to satisfy the "contract", to be completed
	}
	
	/**
	 * 
	 * @param data
	 * @return the highest item in the array.
	 * return 0 if array is null or empty.
	 */
	public static int max(int[] data) {
		return -100; //-100 is just a placeholder to satisfy the "contract", to be completed
	}
	
	/**
	 * 
	 * @param data
	 * @return the smallest item in the array.
	 * return 0 if array is null or empty.
	 */
	public static int min(int[] data) {
		return -100; //-100 is just a placeholder to satisfy the "contract", to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the difference between the highest and the lowest
	 * item of the array.
	 * return 0 if array is null or empty.
	 */
	public static int diff(int[] data) {
		return -100; //-100 is just a placeholder to satisfy the "contract", to be completed
	}
	
	/**
	 * 
	 * @param data
	 * @return true if array is sorted in ascending order.
	 * EXAMPLE: {10, 10, 15} is in ascending order 
	 * (even though not in STRICTLY ascending order), so the 
	 * function must return true for array {10, 10, 15}	 
	 * return false if array is null
	 * return true if array is empty or has a single item (vacuous truth)
	 */
	public static boolean isAscending(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if array is sorted in descending order.
	 * EXAMPLE: {10, 10, 5} is in descending order 
	 * (even though not in STRICTLY descending order), so the 
	 * function must return true for array {10, 10, 5}
	 * return false if array is null
	 * return true if array is empty or has a single item (vacuous truth)
	 */
	public static boolean isDescending(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the average of the array.
	 * return 0 if array is null or empty.
	 */
	public static double average(int[] data) {
		return -100; //-100 is just a placeholder to satisfy the "contract", to be completed
	}
	
	/**
	 * 
	 * @param data
	 * @return an ascending order sorted version of data
	 * IMPORTANT: the parameter array itself should NOT be modified
	 *
	 * return null array if array is null
	 * return empty array if array is empty
	 */
	public static int[] sorted(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the "median" item of the array.
	 * we define median as the item that sits in the middle
	 * when the array is sorted in ascending order.
	 * If the array has an even number of items, use the item to 
	 * the LEFT of the middle parting line.
	 * For example, if the array is {10, 70, 20, 90, 60, 10, 70, 40},
	 * the sorted array is {10, 10, 20, 40, 60, 70, 70, 90}, and the items 
	 * to the left and right of the middle line are 40 and 60.
	 * Thus the function must return 40 in this case.
	 * If the array is {30, 10, 20, 50, 40}, the sorted array is
	 * {10, 20, 30, 40, 50} and the answer is clear: 30
	 * 
	 * return 0 if array is null or empty.
	 */
	public static int median(int[] data) {
		return -100; //-100 is just a placeholder to satisfy the "contract", to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the most common item in the array.
	 * IMPORTANT: in case of tie, return the item that occurs first in the array
	 * 
	 * return 0 if the array is null or empty
	 */
	public static int mostCommonItem(int[] data) {
		return -100; //-100 is just a placeholder to satisfy the "contract", to be completed
	}
	
	/**
	 * HD - 1
	 * @param data
	 * @return the length of the longest ascending sequence in the array
	 * return 0 if array is null or empty.
	 */
	public static int longestAscendingSequenceLength(int[] data) {
		return -100; //-100 is just a placeholder to satisfy the "contract", to be completed
	}
	
	/**
	 * HD - 2
	 * @param data
	 * @return the starting index of the longest ascending sequence in the array
	 * in case of tie, return the starting index of the first of the tied sequences
	 * return -1 if array is null or empty.
	 */
	public static int longestAscendingSequenceStart(int[] data) {
		return -100; //-100 is just a placeholder to satisfy the "contract", to be completed
	}
	
	/**
	 * HD - 3
	 * @param data
	 * @return the longest ascending sequence in the array
	 * in case of tie, return the first of the tied sequences
	 * return null if array is null
	 * return empty array if array is empty
	 */
	public static int[] longestAscendingSequence(int[] data) {
		return new int[0]; //to be completed
	}
}

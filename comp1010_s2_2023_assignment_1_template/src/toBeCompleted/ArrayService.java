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
		if(data != null) {
			for(int i=0;i<data.length;i++) {
				if(data[i] == target) {
					return i;
				}
			}
		}
		return -1;
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
		int count = 0;
		if(data == null) {
			return count;
		}
		for(int i=0;i<data.length;i++) {
			if(data[i] == target) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 
	 * @param data
	 * @return the highest item in the array.
	 * return 0 if array is null or empty.
	 */
	public static int max(int[] data) {
		int highest = 0;
		boolean firstTime = true;
		if(data != null) {
			for(int i=0;i<data.length;i++) {
				if(firstTime == true || data[i] > highest) {
					highest = data[i];
					firstTime = false;
				}
				
			}
		}
		return highest;
	}
	
	/**
	 * 
	 * @param data
	 * @return the smallest item in the array.
	 * return 0 if array is null or empty.
	 */
	public static int min(int[] data) {
		int smallest = 0;
		boolean firstTime = true;
		if(data != null) {
			for(int i=0;i<data.length;i++) {
				if(firstTime == true || data[i] < smallest) {
					smallest = data[i];
					firstTime = false;
				}
				
			}
		}
		return smallest;
	}

	/**
	 * 
	 * @param data
	 * @return the difference between the highest and the lowest
	 * item of the array.
	 * return 0 if array is null or empty.
	 */
	public static int diff(int[] data) {
		int highest = 0;
		int lowest = 0;
		boolean highFirst = true;
		boolean lowFirst = true;
		if(data == null) {
			return 0;
		}
		for(int i=0;i<data.length;i++) {
			if(highFirst == true || data[i] > highest) {
				highFirst =false;
				highest = data[i];
			}
			if(lowFirst == true || data[i] < lowest){
				lowFirst = false;
				lowest = data[i];
			}
		}
		return highest-lowest;
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
		if(data == null) {
			return false;
		}else if(data.length <=1) {
			return true;
		}else {
			for(int i= data.length-1 ;i >= 1;i--) {
				if(data[i] < data[i-1]) {
					return false;
				}
			}
			return true;
		}
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
		if(data == null) {
			return false;
		}else if(data.length <=1) {
			return true;
		}else {
			for(int i= data.length-1 ;i >= 1;i--) {
				if(data[i] > data[i-1]) {
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * 
	 * @param data
	 * @return the average of the array.
	 * return 0 if array is null or empty.
	 */
	public static double average(int[] data) {
		double total = 0;
		if(data == null || data.length == 0) {
			return 0.0;
		}
		for(int i=0;i<data.length;i++) {
			total += data[i];
		}
		
		return total/data.length;
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
		if(data == null) {
			return null;
		}
		int[] newArr = new int[data.length];
		for(int i=0;i<newArr.length;i++) {
			newArr[i] = data[i];
		}
		int hold= 0;
			for(int i= 0; i<data.length-1;i++) {
				for(int j=i+1;j< data.length;j++){
					if(newArr[i] > newArr[j]) {
						hold = newArr[j];
						newArr[j] = newArr[i];
						newArr[i] = hold;
					}
				}
			}
		return newArr;
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
		if(data == null || data.length == 0) {
			return 0;
		}else if(data.length == 1) {
			return data[0];
		}
		
		int hold= 0;
		for(int i= 0; i<data.length-1;i++) {
			for(int j=i+1;j< data.length;j++){
				if(data[i] > data[j]) {
					hold = data[j];
					data[j] = data[i];
					data[i] = hold;
				}
			}
		}
		
		int middle = data.length/2 - 1;
		return data[middle];
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
		if(data == null || data.length == 0) {
			return 0;
		}
		int lengthMax = 1;
		int length = 1;
		for(int i =0; i<data.length-1; i++) {
			length = 1;
			for(int j=i;j<data.length-1;j++) {
				if(data[j] > data[j+1]) {
					break;
				}
				length++;
			}
			if(length > lengthMax) {
				lengthMax = length;
			}
		}
		return lengthMax;
	}
	
	/**
	 * HD - 2
	 * @param data
	 * @return the starting index of the longest ascending sequence in the array
	 * in case of tie, return the starting index of the first of the tied sequences
	 * return -1 if array is null or empty.
	 */
	public static int longestAscendingSequenceStart(int[] data) {
		if(data == null || data.length == 0) {
			return -1;
		}
		int lengthMax = 1;
		int length = 1;
		int index = 0;
		for(int i =0; i<data.length-1; i++) {
			length = 1;
			for(int j=i;j<data.length-1;j++) {
				if(data[j] > data[j+1]) {
					break;
				}
				length++;
			}
			if(length > lengthMax) {
				lengthMax = length;
				index =i;
			}
		}
		
		return index;
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
		if(data == null ) {
			return null;
		}else if(data.length==0) {
			return new int[0];
		}
		
		int lengthMax = 1;
		int length = 1;
		int index = 0;
		for(int i =0; i<data.length-1; i++) {
			length = 1;
			for(int j=i;j<data.length-1;j++) {
				if(data[j] > data[j+1]) {
					break;
				}
				length++;
			}
			if(length > lengthMax) {
				lengthMax = length;
				index =i;
			}
		}
		int[] longestSequence = new int[lengthMax];
		for(int i = 0; i<lengthMax;i++) {
			longestSequence[i] = data[i+index];
		}
	
		return longestSequence;
	}
}

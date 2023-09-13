package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import toBeCompleted.ArrayService;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import doNotModify.CustomTestMethodOrder;
import doNotModify.Graded;
import doNotModify.Order;

@TestMethodOrder(CustomTestMethodOrder.class)
class ArrayServiceTest {
	
	@Test
    @Graded(description = "indexOf", marks = 7.5)
	@Order(1)
	public void testIndexOf() {
		int[] data = {12, 82, 812, 58, -13, 40, 0, 58};
		assertEquals(0, ArrayService.indexOf(data, 12));
		assertEquals(6, ArrayService.indexOf(data, 0));
		assertEquals(3, ArrayService.indexOf(data, 58));
		assertEquals(-1, ArrayService.indexOf(data, 83));
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}	
	
	@Test
    @Graded(description = "indexOf (null check)", marks = 1)
	@Order(2)
	public void testIndexOfNullEmptyCheck() {
		int[] data = null;
		assertEquals(-1, ArrayService.indexOf(data, 10));
	
		data = new int[] {};
		assertEquals(-1, ArrayService.indexOf(data, 50));
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "countOccurrences", marks = 7.5)
	@Order(3)
	public void testCountOccurrences() {
		int[] data = {10, 70, 20, 90, 60, 10, 70, 40, 10};
		assertEquals(3, ArrayService.countOccurrences(data, 10));
		assertEquals(1, ArrayService.countOccurrences(data, 40));
		assertEquals(0, ArrayService.countOccurrences(data, 80));
		
		data = new int[]{-50};
		assertEquals(1, ArrayService.countOccurrences(data, -50));

		data = new int[1001];
		for(int i=1; i < data.length; i++) {
			data[i] = (data[i-1]%2 + 1)%2;
		}
		//array is {0, 1, 0, 1, 0, 1, 0, ..., 0, 1, 0}
		assertEquals(500, ArrayService.countOccurrences(data, 1));
		assertEquals(501, ArrayService.countOccurrences(data, 0));

		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}	
	
	@Test
    @Graded(description = "countOccurrences (null check)", marks = 1)
	@Order(4)
	public void testCountOccurrencesNullEmptyCheck() {
		int[] data = null;
		assertEquals(0, ArrayService.countOccurrences(data, 10));
	
		data = new int[] {};
		assertEquals(0, ArrayService.countOccurrences(data, 50));
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "max", marks = 7.5)
	@Order(5)
	public void testMax() {
		int[] data = {10, 70, 20, 90, 60, 10, 70, 40, 10};
		assertEquals(90, ArrayService.max(data));
		
		data = new int[]{-50};
		assertEquals(-50, ArrayService.max(data));

		data = new int[1001];
		for(int i=1; i < data.length; i++) {
			data[i] = (data[i-1]%2 + 1)%2;
		}
		//array is {0, 1, 0, 1, 0, 1, 0, ..., 0, 1, 0}
		assertEquals(1, ArrayService.max(data));

		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}	
	
	@Test
    @Graded(description = "max (null check)", marks = 1)
	@Order(6)
	public void testMaxNullEmptyCheck() {
		int[] data = null;
		assertEquals(0, ArrayService.max(data));
	
		data = new int[] {};
		assertEquals(0, ArrayService.max(data));
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "min", marks = 7.5)
	@Order(7)
	public void testMin() {
		int[] data = {60, 10, 70, 40, 10, 70, 20, 90, 10};
		assertEquals(10, ArrayService.min(data));
		
		data = new int[]{-50};
		assertEquals(-50, ArrayService.min(data));

		data = new int[1001];
		for(int i=1; i < data.length; i++) {
			data[i] = (data[i-1]%2 + 1)%2;
		}
		//array is {0, 1, 0, 1, 0, 1, 0, ..., 0, 1, 0}
		assertEquals(0, ArrayService.min(data));

		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}	
	
	@Test
    @Graded(description = "min (null check)", marks = 1)
	@Order(8)
	public void testMinNullEmptyCheck() {
		int[] data = null;
		assertEquals(0, ArrayService.min(data));
	
		data = new int[] {};
		assertEquals(0, ArrayService.min(data));
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "diff", marks = 7.5)
	@Order(9)
	public void testDiff() {
		int[] data = {60, 10, 70, 40, 10, 70, 20, 90, 10};
		assertEquals(80, ArrayService.diff(data));
		
		data = new int[]{-50};
		assertEquals(0, ArrayService.diff(data));

		data = new int[1001];
		for(int i=1; i < data.length; i++) {
			data[i] = (data[i-1]%2 + 1)%2;
		}
		//array is {0, 1, 0, 1, 0, 1, 0, ..., 0, 1, 0}
		assertEquals(1, ArrayService.diff(data));

		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}	
	
	@Test
    @Graded(description = "diff (null check)", marks = 1)
	@Order(10)
	public void testDiffNullEmptyCheck() {
		int[] data = null;
		assertEquals(0, ArrayService.diff(data));
	
		data = new int[] {};
		assertEquals(0, ArrayService.diff(data));
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "isAscending", marks = 7.5)
	@Order(11)
	public void testIsAscending() {
		int[] data = {10, 70, 20, 90};
	
		assertFalse(ArrayService.isAscending(data));
		
		data = new int[] {-42};
		assertTrue(ArrayService.isAscending(data));
		
		data = new int[] {90, 70, 20, 10};
		assertFalse(ArrayService.isAscending(data));

		data = new int[] {10, 70, 90, 100, 200, 400, 80};
		assertFalse(ArrayService.isAscending(data));

		data = new int[] {10, 10, 20, 20, 70, 90, 90};
		assertTrue(ArrayService.isAscending(data));

		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "isAscending (null check)", marks = 1)
	@Order(12)
	public void testIsAscendingNullEmptyCheck() {
		int[] data = null;
		assertFalse(ArrayService.isAscending(data));
	
		data = new int[] {};
		assertTrue(ArrayService.isAscending(data));
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "isDescending", marks = 7.5)
	@Order(13)
	public void testIsDescending() {
		int[] data = {10, 70, 20, 90};
	
		assertFalse(ArrayService.isDescending(data));
		
		data = new int[] {-42};
		assertTrue(ArrayService.isDescending(data));
	
		data = new int[] {90, 70, 20, 10, 30};
		assertFalse(ArrayService.isDescending(data));

		data = new int[] {90, 70, 20, 10};
		assertTrue(ArrayService.isDescending(data));

		data = new int[] {90, 70, 20, 20, 20, 20, 20, 20, 20, 10};
		assertTrue(ArrayService.isDescending(data));

		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "isDescending (null check)", marks = 1)
	@Order(14)
	public void testIsDescendingNullEmptyCheck() {
		int[] data = null;
		assertFalse(ArrayService.isDescending(data));
	
		data = new int[] {};
		assertTrue(ArrayService.isDescending(data));
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "average", marks = 7.5)
	@Order(15)
	public void testAverage() {
		int[] data = {10, 70, 20, 90};
		
		/*
		 * the 0.01 in the following is the tolerance.
		 * so the actual answer can differ by at most 0.01
		 * from the expected answer and the test case would
		 * still pass
		 */
		assertEquals(47.5, ArrayService.average(data), 0.01);
		
		data = new int[] {42};
		assertEquals(42.0, ArrayService.average(data), 0.01);
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "average (null check)", marks = 1)
	@Order(16)
	public void testAverageNullEmptyCheck() {
		int[] data = null;
		assertEquals(0.0, ArrayService.average(data), 0.01);
	
		data = new int[] {};
		assertEquals(0.0, ArrayService.average(data), 0.01);
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}

	@Test
    @Graded(description = "sorted", marks = 7.5)
	@Order(17)
	public void testSorted() {
		int[] data = {10, 70, 20, 90};
		assertNotNull(ArrayService.sorted(data)); 
		assertEquals("[10, 20, 70, 90]", Arrays.toString(ArrayService.sorted(data)));
	
		//data itself should not have modified!
		assertNotNull(ArrayService.sorted(data)); 
		assertEquals("[10, 70, 20, 90]", Arrays.toString(data));
		
		data = new int[]{1, 7, 2, 9, 6, 1, 7, 4};
		assertNotNull(ArrayService.sorted(data)); 
		assertEquals("[1, 1, 2, 4, 6, 7, 7, 9]", Arrays.toString(ArrayService.sorted(data)));
		assertEquals("[1, 7, 2, 9, 6, 1, 7, 4]", Arrays.toString(data));

		data = new int[]{29, 17};
		assertNotNull(ArrayService.sorted(data)); 
		assertEquals("[17, 29]", Arrays.toString(ArrayService.sorted(data)));
		assertEquals("[29, 17]", Arrays.toString(data));

		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "median", marks = 7.5)
	@Order(18)
	public void testMedian() {
		int[] data = {10, 70, 20, 90, 60, 10, 70, 40};
		assertEquals(40, ArrayService.median(data));
		
		data = new int[]{-50};
		assertEquals(-50, ArrayService.median(data));

		data = new int[]{17, 29};
		assertEquals(17, ArrayService.median(data));

		data = new int[1001];
		for(int i=1; i < data.length; i++) {
			data[i] = (data[i-1]%2 + 1)%2;
		}
		//array is {0, 1, 0, 1, 0, 1, 0, ..., 0, 1, 0}
		assertEquals(0, ArrayService.median(data));

		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}	
	
	@Test
    @Graded(description = "median (null check)", marks = 1)
	@Order(19)
	public void testMedianNullEmptyCheck() {
		int[] data = null;
		assertEquals(0, ArrayService.median(data));
	
		data = new int[] {};
		assertEquals(0, ArrayService.median(data));
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "sorted (null check)", marks = 1)
	@Order(20)
	public void testSortedNullEmptyCheck() {
		int[] data = null;
		assertNull(ArrayService.sorted(data));
		
		data = new int[] {};
		assertNotNull(ArrayService.sorted(data));
		assertEquals("[]", Arrays.toString(ArrayService.sorted(data)));
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "mostCommonItem", marks = 7.5)
	@Order(21)
	public void testMostCommonItem() {
		int[] data = {60, 10, 70, 40, 10, 10, 70, 20, 90};
		assertEquals(10, ArrayService.mostCommonItem(data));
		
		data = new int[]{60, 100, 70, 40, 100, 70, 20, 90, 90};
		assertEquals(100, ArrayService.mostCommonItem(data));
		
		data = new int[]{60, 100, 70, 40, 100, 70, 20, 90, 90, 90};
		assertEquals(90, ArrayService.mostCommonItem(data));
		
		data = new int[]{-50};
		assertEquals(-50, ArrayService.mostCommonItem(data));

		data = new int[1001];
		for(int i=1; i < data.length; i++) {
			data[i] = (data[i-1]%2 + 1)%2;
		}
		//array is {0, 1, 0, 1, 0, 1, 0, ..., 0, 1, 0}
		assertEquals(0, ArrayService.mostCommonItem(data));

		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}	
	
	@Test
	@Order(22)
    @Graded(description = "mostCommonItem (null check)", marks = 1)
	public void testmostCommonItemNullEmptyCheck() {
		int[] data = null;
		assertEquals(0, ArrayService.mostCommonItem(data));
	
		data = new int[] {};
		assertEquals(0, ArrayService.mostCommonItem(data));
		
		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "longestAscendingSequenceLength", marks = 2.5)
	@Order(23)
	public void testLongestAscendingSequenceLength() {
		int[] data = null;
		assertEquals(0, ArrayService.longestAscendingSequenceLength(data));
		
		data = new int[]{};
		assertEquals(0, ArrayService.longestAscendingSequenceLength(data));
		
		data = new int[]{10, 70, 20, 90};
		assertEquals(2, ArrayService.longestAscendingSequenceLength(data));
		
		data = new int[]{6, 1, 4, 7, 4, 1, 7, 2, 9, 10};
		assertEquals(3, ArrayService.longestAscendingSequenceLength(data));

		data = new int[]{6, 1, 4, 7, 4, 1, 7, 2, 2, 10, 11};
		assertEquals(4, ArrayService.longestAscendingSequenceLength(data));

		data = new int[]{6, 6, 6, 6, 6, 6, 6, 1, 4, 7, 4, 1, 7, 2, 2, 10, 11};
		assertEquals(7, ArrayService.longestAscendingSequenceLength(data));

		data = new int[]{29, 17};
		assertEquals(1, ArrayService.longestAscendingSequenceLength(data));

		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "longestAscendingSequenceStart", marks = 2.5)
	@Order(24)
	public void testLongestAscendingSequenceStart() {
		int[] data = null;
		assertEquals(-1, ArrayService.longestAscendingSequenceStart(data));
		
		data = new int[]{};
		assertEquals(-1, ArrayService.longestAscendingSequenceStart(data));
		
		data = new int[]{10, 70, 20, 90};
		assertEquals(0, ArrayService.longestAscendingSequenceStart(data));
		
		data = new int[]{60, 10, 40, 70, 4, 1, 7, 2, 9, 10};
		assertEquals(1, ArrayService.longestAscendingSequenceStart(data));

		data = new int[]{6, 1, 4, 7, 4, 1, 7, 2, 2, 10, 11};
		assertEquals(7, ArrayService.longestAscendingSequenceStart(data));

		data = new int[]{6, 6, 6, 6, 6, 6, 6, 1, 4, 7, 4, 1, 7, 2, 2, 10, 11};
		assertEquals(0, ArrayService.longestAscendingSequenceStart(data));

		data = new int[]{29, 17};
		assertEquals(0, ArrayService.longestAscendingSequenceStart(data));

		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	@Test
    @Graded(description = "longestAscendingSequence", marks = 2.0)
	@Order(25)
	public void testLongestAscendingSequence() {
		int[] data = null;
		assertNull(ArrayService.longestAscendingSequence(data)); 

		data = new int[] {};
		assertNotNull(ArrayService.longestAscendingSequence(data)); 
		assertEquals("[]", Arrays.toString(ArrayService.longestAscendingSequence(data))); 

		data = new int[]{10, 70, 20, 90};
		assertNotNull(ArrayService.longestAscendingSequence(data)); 
		assertEquals("[10, 70]", Arrays.toString(ArrayService.longestAscendingSequence(data)));
		
		//data itself should not have modified!
		assertNotNull(data); 
		assertEquals("[10, 70, 20, 90]", Arrays.toString(data));
		
		data = new int[]{6, 1, 4, 7, 4, 1, 7, 2, 9, 10};
		assertNotNull(ArrayService.longestAscendingSequence(data)); 
		assertEquals("[1, 4, 7]", Arrays.toString(ArrayService.longestAscendingSequence(data)));

		data = new int[]{6, 1, 4, 7, 4, 1, 7, 2, 2, 10, 11};
		assertNotNull(ArrayService.longestAscendingSequence(data)); 
		assertEquals("[2, 2, 10, 11]", Arrays.toString(ArrayService.longestAscendingSequence(data)));

		data = new int[]{6, 6, 6, 6, 6, 6, 1, 4, 7, 4, 1, 7, 2, 2, 10, 11};
		assertNotNull(ArrayService.longestAscendingSequence(data)); 
		assertEquals("[6, 6, 6, 6, 6, 6]", Arrays.toString(ArrayService.longestAscendingSequence(data)));

		data = new int[]{29, 17};
		assertNotNull(ArrayService.longestAscendingSequence(data)); 
		assertEquals("[29]", Arrays.toString(ArrayService.longestAscendingSequence(data)));

		//ignore the following statement
		currentMethodName = new Throwable().getStackTrace()[0].getMethodName();
	}
	
	/*
     * DO NOT MODIFY THE CODE BELOW
     */

    public static double score = 0;
    public static String result = "";
    public static String currentMethodName = null;
    ArrayList<String> methodsPassed = new ArrayList<String>();

    @BeforeEach
    public void run() {
    	currentMethodName = null;
    }

    @AfterEach
    public void logSuccess() throws NoSuchMethodException, SecurityException {
        if (currentMethodName != null && !methodsPassed.contains(currentMethodName)) {
            methodsPassed.add(currentMethodName);
            Method method = getClass().getMethod(currentMethodName);
            Graded graded = method.getAnnotation(Graded.class);
            score += graded.marks();
            score = Math.min(score, 100);
            result += graded.description() + " passed. Marks awarded: " + graded.marks() + "\n";
            doNotModify.CSV.write(this.getClass().toString(), currentMethodName, graded.marks());
        }
    }

    @AfterAll
    public static void wrapUp() throws IOException {
        if (result.length() != 0) {
            result = result.substring(0, result.length() - 1); // remove the last "\n"
        }
        System.out.println(result);
        System.out.println("\nMarks for this file: " + score);
    }

}

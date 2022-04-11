import java.util.Arrays;
import java.util.Random;


public class ArrayMethods {

	//***NOTE that these methods will change the array itself


	//part a, fill in this method
	public static void swapFirstAndLast(int[] values) {
		// save the first element to a temp var
		int temp = values[0];
		//move the last element to the first position
		values[0] = values[values.length-1];
		// now put the saved first element into the last position
		values[values.length-1] = temp;


	}

	//part b, fill in this method
	public static void shiftRight(int[] values) {

	}

	//part c, set all even elements to 0.
	public static void setEvensToZero(int[] values) {

	}

	//part d, replace each element except the first and last by larger of two 
	//around it
	public static void largerOfAdjacents(int[] values) {

	}

	//part e, remove middle el if odd length, else remove middle two els.
	public static int[] removeMiddle(int[] values) {
		//replace the following line with your answer
		//this line needed to compile
		return null;
	}

	//part f - move all evens to front
	public static void moveEvensToFront(int[] values) {

	}

	//part g - return second largest element in array
	public static int ret2ndLargest(int[] values) {
		// replace this line with your correct return value
		return 0; 
	}

	//part H - returns true if array is sorted in increasing order 
	public static boolean isSorted(int[] values) {
		// replace this line with your correct return value
		return false; 
	}

	//PART I - return true if array contains 2 adjacent duplicate values

	public static boolean hasAdjDuplicates(int[] values) {
		// replace this line with your correct return value
		return false; //dummy return value
	}


	//PART J - return true if array contains 2 duplicate values
	//duplicates need not be adjacent to return true

	public static boolean hasDuplicates(int[] values) {
		// replace this line with your correct return value
		return false; 
	}
}


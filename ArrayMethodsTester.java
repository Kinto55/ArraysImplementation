import java.util.Arrays;
import java.util.Random;


public class ArrayMethodsTester {

	//helper method to print an array
	public static void printArray(int[] values) {
		System.out.println(Arrays.toString(values));
	}
	public static void main(String[] args) {

		//In your main method you should test your array methods
		//Create an array of size 10
		//****** HERE
		int[] a = new int[1]; //array of size 1
		
		//**** Fill the array with random values (use a loop, and a
		//Random object)
		
		
		//Now print the array to show initial values
		System.out.println("Initial Array:");
		//note the usage of the "toString()" method here to print the array
		System.out.println(Arrays.toString(a));
		//Could replace the previous line with this:
		//printArray(testValues);
		//blank line
		System.out.println();

		//Test methods below this line.

		//Test of swapFirstAndLast()
		System.out.println("Before call to swapFirstAndLast():");
		printArray(a);
		//swap first and last element
		//this method modifies the array referenced by "testValues"
		ArrayMethods.swapFirstAndLast(a);
		System.out.println("After call to swapFirstAndLast()");
		printArray(a); //printing the same array but it has changed
		System.out.println();

		//continue with tests as you complete methods ...
		


	}

}

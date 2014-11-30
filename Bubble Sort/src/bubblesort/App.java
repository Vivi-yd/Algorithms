/**
 * A demo of bubble sort algorithm. 
 */

package bubblesort;

public class App {

	/**
	 * Returns array of integer in sorted order.
	 * @param array: unsorted array of integers
	 */

	private static int[] sort(int[] array) {
		// outer loop 
		for(int i = 0; i < array.length -1; i++) {
			// inner loop 
			for(int j = 0; j < array.length - (i+1); j++) {
				// swapping if element on left is greater
				if(array[j] > array[j+1]) {
					int tmp = array[j+1];
					array[j+1] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}
	
	/**
	 * Prints array in a readable form.
	 * @param array: array of integers in unsorted order
	 */
	private static void printArray(int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < array.length; i++){
			sb.append(array[i] + ", ");
		}
		sb.append("]");
		String arrayString = sb.toString();
		arrayString = arrayString.substring(0, arrayString.length()-3);
		arrayString = arrayString + "]";
		System.out.println(arrayString);
	}
	
	public static void main(String[] args) {
		int[] inputArray = {8, 4, 9, 1, 3, 6, 7, 5, 2};

		// print input array
		System.out.print("Input array: ");
		printArray(inputArray);
		System.out.println("");
		
		// print output array
		int[] outputArray = sort(inputArray);
		System.out.print("Output array: ");
		printArray(outputArray);
		

	}
	

}

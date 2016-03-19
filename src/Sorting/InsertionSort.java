package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
		int length = unsortedArray.length;
		for (int i = 0; i < length; i++) {
			int j = i
			while (j > 0 && unsortedArray[j] < unsortedArray[j - 1]) {
				int tmp = unsortedArray[j - 1];
				unsortedArray[j - 1] = unsortedArray[j];
				unsortedArray[j] = tmp;
				j--;
			}
		}
		return unsortedArray;
	}
}

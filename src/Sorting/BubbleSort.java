package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
	
		
		 for(int i=0; i < arr.length-1; i++){
 
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                	swap(unsortedArray, j - 1, j);
                }
            }
        }
        return unsortedArray;
	}
	public static void swap(int[] myArray, int indexone, int indextwo){
		int hold = myArray[indexone];
		myArray[indexone] = myArray[indextwo];
		myArray[indextwo] = hold;
	}
}

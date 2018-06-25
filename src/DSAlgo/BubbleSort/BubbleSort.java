package DSAlgo.BubbleSort;

/**
 * Bubble Sort Algorithm
 * In-place Algorithm .
 * O(n*n) time complexity - quadratic
 * Algorithm degrades quickly .
 * Stable Algorithm .
 */
public class BubbleSort {
    /*
        {20,35,-15,7,55,1,-22}
        unsortedPartitionIndex = 6 - this is the last index of the unsorted partition
        i = 0 - index used to traverse the array from left to right .
     */
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};

        // implementation of bubble sort theory .
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex >0; lastUnsortedIndex--){
            for (int i=0; i<lastUnsortedIndex; i++){
                if (intArray[i] > intArray[i+1]){
                    swap(intArray,i,i+1);
                }
            }
        }
        // Printing out the sorted array .
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[]array, int i, int j){
        if (i == j){
            return; // no elements to swap .
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

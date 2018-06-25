package DSAlgo.SelectionSort;

/**
 * Selection sort Algo .
 * In place Algorithm .
 * O(n*n) time complexity - quadratic
 * Doesn't require as much swapping as bubble sort .
 * Unstable Algorithm .
 */
public class SelectionSort {
    /*
        {20,35,-15,7,55,1,-22}
        lastUnsortedIndex = 6 - this is the last index of the unsorted partition
        i = 1 - index used to traverse the array from left to right .
        largest = 0 - index of largest element in unsorted partition .
     */
    public static void main(String[] args) {
        int [] intArray = {20,35,-15,7,-22,1,55};
        // Selection sort algorithm implementation .
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){ // loop increasing the sorted partition by 1 from right to left .
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++){ // loop looking for the largest elements .
                if (intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray,largest,lastUnsortedIndex);
        }
        // displaying the sorted array using Selection Sort Algorithm .
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int [] array, int i, int j){
        if (i == j){
            return; // no elements to swap .
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

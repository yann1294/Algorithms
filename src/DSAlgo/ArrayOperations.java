package DSAlgo;

public class ArrayOperations {

    /**
     * Retrieve an element from an Array .
     */
    /*
        1. Multiply the size of the elements by its index .
        2. Get the start address of the array .
        3. Add the start address to the result of the multiplication .
     */
    public static void main(String[] args) {
        int [ ] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        // retrieve seven knowing the index .
       // for (int i=0; i<intArray.length; i++){
          //  System.out.println(intArray[3]);
        //}
    // retrieval of number 7 assuming we do not know the index .
        int index = -1;
        for (int i=0; i<intArray.length; i++){
            // retrieve number 7 .
            if (intArray[i] == 7){
                index = i;
                break;
            }
        }
        System.out.println("index = " + index); // 3.

    }
}

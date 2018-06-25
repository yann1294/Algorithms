package ds.Queue;

public class Queue {
     private int maxSize; // maintains set number of slots.
     private long[] queueArray; // slots to maintain the data .
     private int front; // index position for the element in the front .
     private int rear; //  index position at the back of the line .
     private int nItems; // counter to maintain the number of items in the queue .

     public Queue(int maxSize) {
          this.maxSize = maxSize;
          this.queueArray = new long[maxSize];
           front = 0; //index position of the first slot of the array .
             rear = -1; // there is no item in the array yet.
          nItems = 0; // we don't have elements in the array yet .
     }

     public long remove(){ // remove item from the front of the queue .
         long temp = queueArray[front];
         front++;
         if (front == maxSize){
              front = 0; //we can set front back to the 0th index so that we can utilize the array again .
         }
         nItems--;
         return temp;
     }
     public long peekFront(){
          return queueArray[front];
     }

     public boolean isEmpty(){
          return nItems == 0;
     }

     public boolean isFull(){
          return (nItems == maxSize);
     }

     public void insert(long j){
          if (rear == maxSize - 1){
               rear = -1;
          }
          rear++;
          queueArray[rear] = j;
          nItems++;

     }
     public void view(){
          System.out.println("[");
          for (int i=0; i<queueArray.length; i++){
               System.out.println(queueArray[i] + " ");

          }
          System.out.println(" ]");
     }
}

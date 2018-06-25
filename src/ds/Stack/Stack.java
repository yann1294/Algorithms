package ds.Stack;

public class Stack {

    private int maxSize;
    private char [] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char j){
        if (isFull()){
            System.out.println("this stack is already full!");
        }else {
            top++;
            stackArray[top] = j;
        }
    }

    public char pop(){
        if (isEmpty()){
            System.out.println("The stack is already empty!");
            return '0';
        }else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }

    public long peak(){
        //return the last item that was placed on top of it .
        return stackArray[top];

    }
    public boolean isEmpty(){ // return negative 1 if there's nothing in the stack
        return (top==-1);
    }

    public boolean isFull(){ // return maxSize-1 = top if stack is full
        return (maxSize-1 == top);
    }
}

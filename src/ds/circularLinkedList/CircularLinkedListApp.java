package ds.circularLinkedList;

public class CircularLinkedListApp {
    public static void main(String[] args) {
        CircularLinkedList mySinglyLinkedList = new CircularLinkedList();
        mySinglyLinkedList.insertFirst(100);
        mySinglyLinkedList.insertFirst(10);
        mySinglyLinkedList.insertFirst(50);
        mySinglyLinkedList.insertFirst(99);
        mySinglyLinkedList.insertFirst(88);
        mySinglyLinkedList.insertLast(9999999);
        mySinglyLinkedList.insertLast(679999);
        mySinglyLinkedList.displayList();
    }
}

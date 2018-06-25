package ds.SinglylinkedLIst;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList mySinglyLinkedList = new SinglyLinkedList();
        mySinglyLinkedList.insertFirst(100);
        mySinglyLinkedList.insertFirst(10);
        mySinglyLinkedList.insertFirst(50);
        mySinglyLinkedList.insertFirst(99);
        mySinglyLinkedList.insertFirst(88);
        mySinglyLinkedList.insertLast(679999);
        mySinglyLinkedList.displayList();

    }
}

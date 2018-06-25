package ds.doublyLinkedList;

public class DoublyLinkedListApp {
    public static void main(String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList();
        myDoublyLinkedList.insertFirst(22);
        myDoublyLinkedList.insertFirst(44);
        myDoublyLinkedList.insertFirst(66);
        myDoublyLinkedList.insertLast(11);
        myDoublyLinkedList.insertLast(33);
        myDoublyLinkedList.insertLast(55);
        myDoublyLinkedList.displayForward();
        myDoublyLinkedList.displayBackwards();
        myDoublyLinkedList.deleteFirst();
        myDoublyLinkedList.deleteLast();
        myDoublyLinkedList.deleteKey(11);
        myDoublyLinkedList.displayForward();
        myDoublyLinkedList.insertAfter(22,77);
        myDoublyLinkedList.insertAfter(33,88);
        myDoublyLinkedList.displayForward();
    }
}

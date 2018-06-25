package ds.SinglylinkedLIst;

public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList() {
    }

    public Node isEmpty(){
        return first = null;
    }

    //used to insert at the begining of the list
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    // used to delete at the begining of the list .

        public Node deleteFirst(){
            Node temp = first;
            first = first.next;
            return temp;
        }

    // display list
    public void displayList(){
        System.out.println("List (first to last");
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void insertLast(int data){
        Node current = first;
        while (current.next!= null){
            current = current.next; // we'll loop until current.next is null
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = newNode;

    }
}

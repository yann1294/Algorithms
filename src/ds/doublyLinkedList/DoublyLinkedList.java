package ds.doublyLinkedList;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()){
            last = newNode; // if empty last will refer to the new node created .
        } else {
            first.previous = newNode;
        }
        newNode.next = first; // the new Node next field will point to the first .
        this.first = newNode;

    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()){
            first = newNode;
        } else {
            last.next = newNode; // assigning old last to new node .
            newNode.previous = last; // the old last will be the newnode previous .
        }
        last = newNode;
    }

    // assume non empty list

    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null){ // there's only one item in the list .
            last = null;
        } else {
            first.next.previous = null; // the list first node will point to null .
        }
        first = first.next;// assigning the reference of the node following the old first node to the
                            // first field in the linkedList object .
        return temp; // return the deleted old first node .
    }

    public Node deleteLast(){
        Node temp = last;
        if (first.next == null){ // one node in the list
            first = null;
        } else {
            last.previous.next = null; // the last node's previous node next field will point to null .
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int data){
        Node currentNode  = first; // we start from begining of the list .

        while (currentNode.data != key){ // as long as we have not found the key in a particular node .
            currentNode = currentNode.next;
            if (currentNode == null){
                return false;
            }
        }
        Node newNode = new Node();
        newNode.data = data;

            if (currentNode == last){
                currentNode.next = null;
                last = newNode;
            } else {
                newNode.next = currentNode.next; // new node next field should point to the ode ahead of the current node .
                currentNode.next.previous = newNode; // the node ahead of current, it's previous field should point to the new node .
            }
            newNode.previous = currentNode;
            currentNode.next = newNode;

            return true;
    }

    public Node deleteKey(int key){
        Node current = first; // start from the begining .
        while (current.data != key){
            current = current.next;
            if (current == null){
                return null;
            }
        }
        if (current == first){
            first = current.next; // make the first field point to the node following current since current will be deleted .
        } else {
            current.previous.next = current.next;
        }

        if (current == last){
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward(){
        System.out.println("List( first -> last): ");
        Node current =first; // start at the begining .
        while (current!= null){
            current.displayNode();
            current = current.next;// move to the next node .
        }
        System.out.println();
    }

    public void displayBackwards(){
        System.out.println("List( last -> first): ");
        Node current = last; // start at the end .
        while (current!= null){
            current.displayNode();
            current = current.previous;// move to the next node .
        }
        System.out.println();
    }
}

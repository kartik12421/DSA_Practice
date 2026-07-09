
class linkedList {

    Node head;
    private int size;

    linkedList() {
        this.size = 0;
    }

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print
    public void printlist() {
        if (head == null) {
            System.out.println("no elements available");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    //delete - first, last
    public void deleteFirst() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }

        Node secondlast = head;
        Node lastNode = head.next;

        size--;
        if (head.next == null) {
            head = null;
        }

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }

        secondlast.next = null;
    }

    //size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addFirst("is");
        list.addFirst("this");
        list.printlist();

        System.out.println("----------------------------------------");

        list.addlast("a");
        list.addlast("list");
        list.printlist();

        System.out.println("----------------------------------------");

        list.deleteFirst();
        list.printlist();

        System.out.println("----------------------------------------");

        list.deletelast();
        list.printlist();

        System.out.println("----------------------------------------");

        System.out.println(list.getSize());

    }
}

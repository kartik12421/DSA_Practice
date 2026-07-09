
class linkedList {

    Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
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

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addFirst("I");
        list.addFirst("am");
        list.printlist();

        list.addlast("hello");
        list.addlast("guys");
        list.printlist();
    }
}

package aud1ugd;

class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
    public static void main(String[] args) {
        Node head = new Node(69);
        head.appendToTail(54);
        head.appendToTail(23);
        head.appendToTail(30);
        head.appendToTail(415);
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(head.data);

    }
}




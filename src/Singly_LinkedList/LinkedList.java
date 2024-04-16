package Singly_LinkedList;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertHead(T data) {
        Node<T> p = new Node<>(data);
        if(head == null) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    public void insertTail(T data) {
        Node<T> p = new Node<>(data);
        if(head == null) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
    }

    public void insertAfterX(T data, T X) {
        Node<T> p = new Node<>(data);
        Node<T> nodeX = head;

        while (nodeX != null) {
            if(nodeX.data == X) {
                break;
            }
            nodeX = nodeX.next;
        }

        if(nodeX != null) {
            p.next = nodeX.next;
            nodeX.next = p;
        } else {
            System.out.println("Khong tim thay Node muc tieu !");
        }
    }

    public void showList() {
        for(var node = head; node != null; node = node.next ) {
            System.out.print(node.data + " -> ");
        }
        System.out.println();
    }
}

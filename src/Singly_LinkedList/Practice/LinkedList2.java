package Singly_LinkedList.Practice;

public class LinkedList2<T> {
    private Node<T> head;

    static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertBack(T data) {
        Node<T> p = new Node<>(data);
        Node<T> temp = head;

        if(head == null) {
            head = p;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = p;
        }
    }

    public void insertHead(T data) {
        Node<T> p = new Node<>(data);

        if(head == null) {
            head = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    public void insertAfterNodeX(T data, T X) {
        Node<T> p = new Node<>(data);
        Node<T> nodeX = head;
        while (nodeX != null) {
            if(nodeX.data == X) {
                break;
            } else {
                nodeX = nodeX.next;
            }
        }

        if(nodeX != null) {
            p.next = nodeX.next;
            nodeX.next = p;
        } else {
            System.out.println("Khong ton tai node voi gia tri do !");
        }
    }

    public void showList() {
        for(var node = head; node != null; node = node.next) {
            System.out.print(node.data + " -> ");
        }
        System.out.println("null");
    }
}

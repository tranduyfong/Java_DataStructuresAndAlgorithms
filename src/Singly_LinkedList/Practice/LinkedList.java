package Singly_LinkedList.Practice;

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

    // Thêm node vào trước node có giá trị X
    public void insertNodeX(T data, T X) {
        Node<T> p = new Node<>(data);
        Node<T> nodeX = head;
        Node<T> behindNodeX = head;
        if(head == null) {
            head = tail = p;
        } else {
            while (nodeX != null) {
                if (nodeX.data == X) {
                    break;
                }
                behindNodeX = nodeX;
                nodeX = nodeX.next;
            }

            if (nodeX != null) {
                p.next = nodeX;
                behindNodeX.next = p;
            } else {
                System.out.println("Node khong ton tai voi gia tri do !");
            }
        }
    }

    public void showList() {
        for(var node = head; node != null; node = node.next) {
            System.out.print(node.data + " -> ");
        }
        System.out.println("null");
        System.out.println();
    }
}

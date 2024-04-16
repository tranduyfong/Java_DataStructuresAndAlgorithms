package Singly_LinkedList.Practice;

public class Bai2 {
    public static void main(String[] args) {
        LinkedList2<Integer> linkedList2 = new LinkedList2<>();
        // Insert head
        linkedList2.insertHead(2);
        linkedList2.insertHead(3);
        linkedList2.insertHead(4);
        linkedList2.insertHead(5);
        linkedList2.insertHead(6);

        // Insert back
        linkedList2.insertBack(7);
        linkedList2.insertBack(8);
        linkedList2.insertBack(9);
        linkedList2.insertBack(10);
        linkedList2.insertBack(11);

        // Show linkedList
        linkedList2.showList();
    }
}

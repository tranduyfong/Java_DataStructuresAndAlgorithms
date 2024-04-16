package Singly_LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> nameLinkedList = new LinkedList<String>();
        // Insert
        nameLinkedList.insertTail("Hong");
        nameLinkedList.insertTail("Loan");
        nameLinkedList.insertTail("Ha");
        nameLinkedList.insertTail("Huong");
        nameLinkedList.insertTail("Phong");
        nameLinkedList.insertTail("Quan");

        // Show
        nameLinkedList.showList();

        // Insert head
        nameLinkedList.insertHead("Quang");
        nameLinkedList.showList();

        // Insert Node after some Node
        nameLinkedList.insertAfterX("Khanh", "Huong");
        nameLinkedList.showList();

        // LinkedList luu gia tri Integer
        LinkedList<Integer> linkedListNumber = new LinkedList<Integer>();
        linkedListNumber.insertHead(1);
        linkedListNumber.insertHead(12);
        linkedListNumber.insertHead(123);
        linkedListNumber.insertHead(1234);
        linkedListNumber.insertHead(12345);
        linkedListNumber.showList();
    }
}

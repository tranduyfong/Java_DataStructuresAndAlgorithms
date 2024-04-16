package Singly_LinkedList.Practice;

public class Bai1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        // Insert Node
        linkedList.insertNodeX(3, 2);
        linkedList.insertNodeX(4, 3);
        linkedList.insertNodeX(5, 4);
        linkedList.insertNodeX(35, 5);
        linkedList.insertNodeX(36, 35);
        linkedList.insertNodeX(37, 36);

        linkedList.showList();
    }
}

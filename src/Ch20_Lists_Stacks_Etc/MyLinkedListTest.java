package Ch20_Lists_Stacks_Etc;

public class MyLinkedListTest {
    public static void main(String[] args) throws Exception{
//        MyNode first = new MyNode(1);
//        MyNode second = new MyNode(2);
//        MyNode third = new MyNode(3);
//        first.next = second;
//        second.next = third;
//        third.next = null; // last node
//
//        MyNode temp = first;
//        while (temp != null) {
//            System.out.println("node data: " + temp.data);
//            temp = temp.next;
//        }

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(new MyNode(1));
        myLinkedList.add(new MyNode(2));
        myLinkedList.add(new MyNode(3));
        myLinkedList.add(new MyNode(4));
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.printList();
//        System.out.println("3. index: " + myLinkedList.get(3));
//        System.out.println("15. index: " + myLinkedList.get(15));
        System.out.println("new linked list after insert");
        myLinkedList.insert(5, 1);
        myLinkedList.insert(7, 0);
        myLinkedList.printList();
    }
}

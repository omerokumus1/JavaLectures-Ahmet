package Ch20_Lists_Stacks_Etc;

public class MyLinkedList {
    private MyNode start;

    MyLinkedList(int size){

    }
    MyLinkedList(){

    }

    public void add(MyNode node){
        if (start == null)
            start = node;
        else{
            MyNode lastNode = getLastNode();
            lastNode.next = node;
        }
    }

    public void add(int data){
//        if (start == null) {
//            start = new MyNode(data);
//        }
//        else{
//            MyNode lastNode = getLastNode();
//            lastNode.next = new MyNode(data);
//        }
        add(new MyNode(data));

    }



    private MyNode getLastNode() {
        MyNode iter = start;
        while (iter.next != null) // find last node
            iter = iter.next;
        return iter;
    }

    public int get(int index) throws IndexOutOfBoundsException {
        int counter = 0;
        MyNode iter = start;
        while (iter != null){
            if (counter == index)
                return iter.data;
            iter = iter.next;
            counter++;
        }
        throw new IndexOutOfBoundsException();
    }

    public void printList(){
        MyNode iter = start;
        while (iter != null) {
            System.out.println("data: " + iter.data);
            iter = iter.next;
        }
    }
}

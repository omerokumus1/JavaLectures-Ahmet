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

    public void insert(int data, int index){
        insert(new MyNode(data), index);
    }

    public void insert(MyNode node, int index) throws IndexOutOfBoundsException{
        if (index < 0)
            throw new IndexOutOfBoundsException();
        if (index == 0){
            addToStart(node);
        }
        else {
            MyNode iter = getNode(index-1);
            if (iter == null)
                throw new IndexOutOfBoundsException();
            else {
                node.next = iter.next;
                iter.next = node;
            }
        }
    }

    private void addToStart(MyNode node){
        node.next = start;
        start = node;
    }

    private MyNode getNode(int index){
        MyNode iter = start;
        int counter = 0;
        while (iter != null) {
            if (counter == index)
                return iter;

            iter = iter.next;
            counter++;
        }
        return null;
    }


    public void remove(int index){

    }


    private MyNode getLastNode() {
        MyNode iter = start;
        while (iter.next != null) // find last node
            iter = iter.next;
        return iter;
    }

    public int get(int index) throws IndexOutOfBoundsException {
        if (index < 0 )
            throw new IndexOutOfBoundsException();
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

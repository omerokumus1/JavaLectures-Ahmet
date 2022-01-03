package Ch20_Lists_Stacks_Etc;

public class MyStack {
    MyNode start;
    MyNode last;

    MyStack(){
        start = null;
        last = null;
    }

    public MyNode pop(){
        if (start == null)
            return null;
        else if (start.next == null)
            return start;

        MyNode nodeBeforeTheLast = getNodeBeforeTheLastNode();
        MyNode lastNode = nodeBeforeTheLast.next;
        nodeBeforeTheLast.next = null;
        return lastNode;
    }

    public MyNode pop2(){
        if (start == null)
            return null;
        else if (start.next == null)
            return start;

        MyNode nodeBeforeTheLast = getNodeBeforeTheLastNode2();
        nodeBeforeTheLast.next = null;
        MyNode lastNode = last;
        last = nodeBeforeTheLast;
        return lastNode;
    }

    private MyNode getNodeBeforeTheLastNode() {
        MyNode lastNode = getLastNode();
        MyNode iter = start;
        while(iter.next != lastNode)
            iter = iter.next;

        return iter;
    }
    private MyNode getNodeBeforeTheLastNode2() {

        MyNode iter = start;
        while(iter.next != last)
            iter = iter.next;

        return iter;
    }

    public void push(MyNode node){
        if (start == null) {
            start = node;
        }
        else{
            MyNode last = getLastNode();
            last.next = node;
        }
    }

    public void push2(MyNode node){
        if (start == null) {
            start = node;
            last = start;
        }
        else{
            last.next = node;
            last = node;
        }
    }

    private MyNode getLastNode() {
        MyNode iter = start;
        while(iter.next != null)
            iter = iter.next;

        return iter;
    }

    public void printStackContent(){
        MyNode iter = start;
        while (iter != null) {
            System.out.println("data: " + iter.data);
            iter = iter.next;
        }
    }
}

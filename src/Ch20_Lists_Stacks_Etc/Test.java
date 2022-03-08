package Ch20_Lists_Stacks_Etc;

public class Test {
    public static void main(String[] args) {
        MyNode myNode = new MyNode(1);
        MyNode myNode2 = new MyNode(1);
        System.out.println(myNode);
        System.out.println(myNode2);
        System.out.println(myNode == myNode2);
        MyNode myNode3 = myNode;
        myNode3.data = 5;
        System.out.println(myNode.data);
    }
}

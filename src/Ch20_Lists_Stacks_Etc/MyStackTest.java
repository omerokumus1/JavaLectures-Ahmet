package Ch20_Lists_Stacks_Etc;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
//        myStack.push(new MyNode(1));
//        myStack.push(new MyNode(2));
//        myStack.push(new MyNode(3));
//        myStack.push(new MyNode(4));
//
//        myStack.printStackContent();
//
//        System.out.println(myStack.pop().data);
//        System.out.println(myStack.pop().data);
//        System.out.println(myStack.pop().data);
//        System.out.println(myStack.pop().data);

        myStack.push2(new MyNode(1));
        myStack.push2(new MyNode(2));
        myStack.push2(new MyNode(3));
        myStack.push2(new MyNode(4));

        myStack.printStackContent();

        System.out.println(myStack.pop2().data);
        System.out.println(myStack.pop2().data);
        System.out.println(myStack.pop2().data);
        System.out.println(myStack.pop2().data);



    }
}

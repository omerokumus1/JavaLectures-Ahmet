package ObjectsAndClasses;

public class Inheritance {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.addLecture("History");
//        System.out.println("reference in main method: " + t1);
        Circle c1 = new Circle(5,3);
        t1.dummyFunction();
        t1.eat();

        // contructor chaining: subclass'ın constructor'ı üst class'ın argümansız constructor'ını otomatik çağırır
    }
}

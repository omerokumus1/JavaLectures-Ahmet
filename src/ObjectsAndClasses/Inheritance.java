package ObjectsAndClasses;

import javax.print.Doc;

public class Inheritance {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.addLecture("History");
//        System.out.println("reference in main method: " + t1);
        Circle c1 = new Circle(5, 3);
        t1.dummyFunction();
        t1.eat();

        // contructor chaining: subclass'ın constructor'ı üst class'ın argümansız constructor'ını otomatik çağırır

        // method overriding
        Person p1 = new Person();
        t1 = new Teacher();
        Doctor d1 = new Doctor();
        p1.speak();
        t1.speak();
        d1.speak();

        System.out.println(t1);

        // subtype and supertype:
        // polymorphism
        Person p2 = new Person();
        Teacher t2 = new Teacher();
        Doctor d2 = new Doctor();
        printPerson(p2);
        printPerson(t2);
        printPerson(d2);

        // declared type and actual type
        int x;
        // Person: declared type, Teacher: actual type
        Person p3 = new Teacher(); // her teacher bir person olduğu için hata vermez
        // DeclaredType variableName = new ActualType();
//        Teacher t3 = new Person(); // her person bir teacher olmadığı için hata verir
        System.out.println(p3);

        // dynamic binding: class hiyerarşisi içinde hangi methodun kullanılacağına runtime'de karar verilir.

        // casting
        double d = 3.21;
        int x2 = (int)d;
        int x3 = 7;
        double d3 = x3; // implicit casting

        // implicit object casting
        Person p4;
        // upcasting
        p4 = t1; // person değişkenine teacher ataması yapılıyor
        Person p6;
        p6 = d1;
        if (p4 instanceof Teacher) // class check
            System.out.println("instance of teacher");
        else if (p6 instanceof Doctor) // class check
            System.out.println("instance of doctor");


        // down casting
        t2 = (Teacher) p4; // explicit casting


        Person p5 = new Person();
        Teacher t5;
        if (p5 instanceof Teacher) // class check
            t5 = (Teacher) p5; // explicit casting

        // using parenthesis in casting: ( casting ).functionCall
        ((Teacher) p4).dummyFunction();


    }

    public static void printPerson(Person person){
        System.out.println(person);
    }

}

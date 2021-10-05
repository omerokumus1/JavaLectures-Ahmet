package ObjectsAndClasses;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        if (al.add(6))
            System.out.println("Ekleme başarılı.");
        else
            System.out.println("Ekleme başarısız.");

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(100);
        al2.add(101);
        al2.add(102);

        al.addAll(al2);

        System.out.println(al);

        al.add(2, 25);
        al.set(3, 26);
        System.out.println(al);

        System.out.println(al.contains(25));
        System.out.println(al.contains(27));

        ArrayList<Integer> al3 = (ArrayList<Integer>) al.clone();
        System.out.println(al3);
        System.out.println("al3 == al?: " + (al3 == al));

        ArrayList<Integer> al4 = al;
        al4.set(1, 99);
        System.out.println(al);

        al.ensureCapacity(50);

        al.trimToSize();


    }
}

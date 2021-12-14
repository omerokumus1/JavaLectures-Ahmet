package JavaGenerics;

import MobaGame.Heros.Hero;

import java.util.ArrayList;

public class GenericsIntro {
    public static void main(String[] args) throws Exception {
        ArrayList<String> al;
        ArrayList<Integer> al2;
        ArrayList<Character> al3;
        ArrayList<Hero> al4;

        // (Formal) Generic Type: E ya da T ile gösterilen, değiştirilebilir alandır.
        // (Actual) Concrete Type: E ya da T'ye atadığın veri tipi. Örn;  ArrayList<Integer> al2; -> Integer actual concrete type'dir
        // Generic Instantiation: E ya da T'ye tip atama işlemidir. ArrayList<Integer> -> Generic Instantiation olur, E = Integer anlamına gelir

        DummyArray<Integer> da = new DummyArray<>();
        for (int i = 0; i < 9; i++) {
            da.add(i);
        }
        System.out.println(da);
        da.add(9);
//        da.add(10);
        System.out.println("5. " + da.get(5));
//        da.get(12);
        // Genericler compile time error verir, bu sayede run time error maliyetinden kurtarır

        // Calling generic static method
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        print(arr);

        String[] strings = {"a", "b", "c", "d"};
        print(strings);

        SortingArrayOfObjects.User user;

    }

    // Generic static method (method overloading yapmadan tek methodla print yapar)
    private static <E> void print(E[] array) {
        for (E e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }


}

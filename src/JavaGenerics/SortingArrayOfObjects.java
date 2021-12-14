package JavaGenerics;

import java.util.Arrays;

public class SortingArrayOfObjects {

    static class User implements Comparable<User> {
        String name;

        User(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(User o) {
            return name.compareTo(o.name);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {
        Integer[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        String[] strings = {"c", "d", "e", "a", "b"};
        User[] users = {
                new User("Java"), new User("C++"), new User("Python"),
                new User("PHP"), new User("Kotlin")
        };

        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        strings = bubbleSort(strings);
        System.out.println(Arrays.toString(strings));

        users = bubbleSort(users);
        System.out.println(Arrays.toString(users));

    }

    private static <E extends Comparable<E>> E[] bubbleSort(E[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1].compareTo(arr[i]) < 0) {
                    switchConsecutiveNumbers(arr, i);
                }
            }
        }
        return arr;
    }

    private static <E> void switchConsecutiveNumbers(E[] arr, int i) {
        E temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

}

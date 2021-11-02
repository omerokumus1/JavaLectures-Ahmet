package Interfaces;

public class Laviva implements Edible, Comparable{
    @Override
    public void howToEat() {
        System.out.println("Bite by bite");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

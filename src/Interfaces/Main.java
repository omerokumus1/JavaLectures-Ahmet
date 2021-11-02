package Interfaces;

public class Main {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Chicken c = new Chicken();
        Apple a = new Apple();
        Laviva l = new Laviva();
        t.howToEat();
        c.howToEat();
        a.howToEat();
        l.howToEat();
        System.out.println("Can tiger move?: " + t.canMove());
        System.out.println("Can chicken move?: " + c.canMove());
        System.out.println("Can apple move?: " + a.canMove());

    }
}

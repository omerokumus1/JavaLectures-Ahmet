package Interfaces;

public class Laviva implements Edible, Comparable<Laviva> {
    private int price;

    Laviva(int price) {
        this.price = price;
    }

    Laviva() {
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void howToEat() {
        System.out.println("Bite by bite");
    }

    @Override
    public int compareTo(Laviva l) {
        if (this.price > l.price)
            return 1;
        else if (this.price == l.price)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Laviva{" +
                "price=" + price +
                '}';
    }
}

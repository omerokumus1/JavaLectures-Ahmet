package Interfaces;

public class Chicken implements Edible, Movable{
    @Override
    public void howToEat() {
        System.out.println("Try boiling.");
    }

    @Override
    public boolean canMove() {
        return true;
    }
}

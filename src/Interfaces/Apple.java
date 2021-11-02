package Interfaces;

public class Apple implements Edible, Movable{
    @Override
    public void howToEat() {
        System.out.println("Raw");
    }

    @Override
    public boolean canMove() {
        return false;
    }
}

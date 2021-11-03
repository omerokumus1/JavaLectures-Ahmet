package Interfaces;

public class Tiger implements Edible, Movable, Cloneable{
    @Override
    public void howToEat() {
        System.out.println("You cannot eat me.");
    }

    @Override
    public boolean canMove() {
        return true;
    }

}

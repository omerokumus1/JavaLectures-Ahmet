package Interfaces;

public class Apple implements Edible, Movable{
    private int cal;
    @Override
    public void howToEat() {
        System.out.println("Raw");
    }
    Apple(){}
    Apple(int cal){
        this.cal = cal;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    @Override
    public boolean canMove() {
        return false;
    }
}

package Polymorphism;

import java.util.ArrayList;

public class Chart {
    private Computer computer;
    private ArrayList<Object> items = new ArrayList<>();

    public Chart(Computer computer) {
        this.computer = computer;
        items = new ArrayList<>();
    }

    public Chart(){}

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void addItem(Object o){
        items.add(o);
    }

    public void listItems(){
        System.out.println("Computers");
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) instanceof Computer)
                System.out.println(items.get(i));
        }

        System.out.println("Keyboards");
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) instanceof Keyboard)
                System.out.println(items.get(i));
        }
    }

}

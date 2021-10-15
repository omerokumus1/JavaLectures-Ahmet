package MobaGame;

import MobaGame.Arcanas.Arcana;
import MobaGame.Equipments.Equipment;

import java.util.ArrayList;

public class Backpack {
    private int coin;
    private ArrayList<Equipment> equipments;

    Backpack(){
        equipments = new ArrayList<>();
        coin = 0;
    }



    public void buyEquipment(Equipment equipment){
        if (equipments.size() <= 4){
            equipments.add(equipment);
        }
        else
            System.out.println("Maximum number of equipments are bought.");
    }

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }


    public int getCoin() {
        return coin;
    }

    public void addCoin(int coin) {
        this.coin += coin;
    }

    public void subtractCoin(int coin){
        this.coin = coin;
    }


}

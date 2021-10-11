package MobaGame;

import MobaGame.Arcanas.Arcana;
import MobaGame.Equipments.Equipment;

import java.util.ArrayList;

public class Backpack {
    private int coin;
    private ArrayList<ArcanaFragment> arcanaFragments;
    private ArrayList<Equipment> equipments;
    private ArrayList<Arcana> arcanas;

    Backpack(){
        arcanaFragments = new ArrayList<>();
        arcanaFragments.ensureCapacity(800);
        equipments = new ArrayList<>();
        equipments.ensureCapacity(4);
        arcanas = new ArrayList<>();
        arcanas.ensureCapacity(9);
        coin = 0;
    }

    public void buyArcana(Arcana arcana){
        if (arcanas.size() <= 9)
            arcanas.add(arcana);
        else
            System.out.println("Maksimum number of equipments are bought.");
    }

    public ArrayList<Arcana> getArcanas() {
        return arcanas;
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

    public ArrayList<ArcanaFragment> getArcanaFragments() {
        return arcanaFragments;
    }

    public void buyArcanaFragment(int fragmentNumber){
        for (int i = 0; i < fragmentNumber; i++) {
            arcanaFragments.add(new ArcanaFragment());
        }
        int totalCost = fragmentNumber * ArcanaFragment.cost;
        subtractCoin(totalCost);
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

    private void subtractArcanaFragment(int fragmentNumber){
        int length = arcanaFragments.size();
        int limit = length-1-fragmentNumber;
        for (int i = length-1; i >= limit; i--) {
            arcanaFragments.set(i, null);
        }
    }

    public void updateArcana(){
        int length = arcanas.size();
        Arcana arcana;
        for (int i = 0; i < length; i++) {
            arcana = arcanas.get(i);
            if (arcana.getNeededArcanaFragment() <= arcanaFragments.size()){
                arcana.updateArcana();
                subtractArcanaFragment(arcana.getNeededArcanaFragment());
            }
        }
    }
}

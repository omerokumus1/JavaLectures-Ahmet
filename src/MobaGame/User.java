package MobaGame;

import MobaGame.Arcanas.Arcana;
import MobaGame.Equipments.*;
import MobaGame.Heros.Assassin;
import MobaGame.Heros.Hero;
import MobaGame.Heros.Mage;
import MobaGame.Heros.Marksman;

import java.util.ArrayList;

public class User {
    private String username;
    private Backpack backpack;
    private Hero hero;

    User(String username, Backpack backpack, Hero hero) {
        this.username = username;
        this.backpack = backpack;
        setHero(hero);
    }

    public String getUsername() {
        return username;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public Hero getHero() {
        return hero;
    }

    // ********
    public void setHero(Hero hero) {
        this.hero = hero;

    }

    // ************
    public void attack() {

    }

    public void addCoin(int coin) {
        backpack.addCoin(coin);
    }

    public void subtractCoin(int coin) {
        backpack.subtractCoin(coin);
    }

    public int getCoin() {
        return backpack.getCoin();
    }

    public void buyArcanaFragment(int fragmentNumber) {
        backpack.buyArcanaFragment(fragmentNumber);
//        ArrayList<ArcanaFragment> arcanaFragments = backpack.getArcanaFragments();
//        for (int i = 0; i < fragmentNumber; i++) {
//            arcanaFragments.add(new ArcanaFragment());
//        }
//        int totalCost = fragmentNumber * ArcanaFragment.cost;
//        subtractCoin(totalCost);
    }

    public ArrayList<ArcanaFragment> getArcanaFragments() {
        return backpack.getArcanaFragments();
    }


    public void buyEquipment(Equipment equipment) {
        backpack.buyEquipment(equipment);
        subtractCoin(equipment.getPrice());
        // add equipment to hero
        hero.applyEquipment();
    }

    private void addEquipmentToHero(Equipment equipment) {

    }

//    private Equipment getActualClassOfEquipment(Equipment equipment) {
//
//        if (equipment instanceof DefenceEquipment) {
//            return (DefenceEquipment) equipment;
//        } else if (equipment instanceof MagicalAttackEquipment) {
//            return (MagicalAttackEquipment) equipment;
//        } else if (equipment instanceof PhysicalAttackEquipment) {
//            return (PhysicalAttackEquipment) equipment;
//        } else if (equipment instanceof SpeedEquipment) {
//            return (SpeedEquipment) equipment;
//        }
//        return equipment;
//    }
//
//    private Hero getActualClassOfHero(){
//        if (hero instanceof Assassin)
//            return (Assassin) hero;
//        else if (hero instanceof Mage)
//            return (Mage) hero;
//        else if (hero instanceof Marksman)
//            return (Marksman) hero;
//    }

    // ************
    private void addAttackEquipmentToHero(AttackEquipment equipment) {

    }

    public ArrayList<Equipment> getEquipments() {
        return backpack.getEquipments();
    }

    public void buyArcana(Arcana arcana) {
        backpack.buyArcana(arcana);
        // add arcana to hero
    }

    public ArrayList<Arcana> getArcanas() {
        return backpack.getArcanas();
    }

    public void updateArcana() {
        backpack.updateArcana();
    }

}

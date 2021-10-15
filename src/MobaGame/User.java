package MobaGame;

import MobaGame.Arcanas.Arcana;
import MobaGame.Equipments.*;
import MobaGame.Heros.*;

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
    public void attack(User villain) {
        if (hero instanceof PhysicalAttackHero){
            villain.decreaseHpBy(((PhysicalAttackHero) hero).getCurrentPhysicalAttack());
        }
        else if (hero instanceof Mage){
            villain.decreaseHpBy(((Mage) hero).getCurrentMagicalAttack());
        }
    }

    private void decreaseHpBy(int attack) {
        hero.decreaseHpBy(attack);
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



    public void buyEquipment(Equipment equipment) {
        backpack.buyEquipment(equipment);
        subtractCoin(equipment.getPrice());
        // add equipment to hero
        hero.applyEquipment(equipment);
    }


    public ArrayList<Equipment> getEquipments() {
        return backpack.getEquipments();
    }


}

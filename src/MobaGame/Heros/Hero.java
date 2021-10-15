package MobaGame.Heros;

import MobaGame.Arcanas.*;
import MobaGame.Equipments.*;
import MobaGame.Skills.Skill;

public class Hero {
    private String heroName;
    private int baseHp;
    private int currentHp;
    private int baseSp;
    private int currentSp;
    private int basePhysicalDefence;
    private int baseMagicalDefence;
    private int currentPhysicalDefence;
    private int currentMagicalDefence;
    private final static int MAX_EQUIPMENT = 4;
    private Equipment[] equipments;
    private Skill[] skills;

    Hero(){

    }

    public Hero(String heroName, int baseHp, int baseSp, int basePhysicalDefence, int baseMagicalDefence, Skill[] skills) {
        this.heroName = heroName;
        this.baseHp = baseHp;
        this.currentHp = baseHp;
        this.baseSp = baseSp;
        this.currentSp = baseSp;
        this.basePhysicalDefence = basePhysicalDefence;
        this.baseMagicalDefence = baseMagicalDefence;
        this.currentPhysicalDefence = basePhysicalDefence;
        this.currentMagicalDefence = baseMagicalDefence;
        this.skills = skills;
        equipments = new Equipment[MAX_EQUIPMENT];
    }


    public void increaseCurrentHpBy(int currentHp) {
        this.currentHp += currentHp;
    }

    public void increaseCurrentSpBy(int currentSp) {
        this.currentSp += currentSp;
    }

    public void increaseCurrentPhysicalDefenceBy(int currentPhysicalDefence) {
        this.currentPhysicalDefence += currentPhysicalDefence;
    }

    public void increaseCurrentMagicalDefenceBy(int currentMagicalDefence) {
        this.currentMagicalDefence += currentMagicalDefence;
    }

    public String getHeroName() {
        return heroName;
    }

    public int getBaseHp() {
        return baseHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getBaseSp() {
        return baseSp;
    }

    public int getCurrentSp() {
        return currentSp;
    }

    public int getBasePhysicalDefence() {
        return basePhysicalDefence;
    }

    public int getBaseMagicalDefence() {
        return baseMagicalDefence;
    }

    public int getCurrentPhysicalDefence() {
        return currentPhysicalDefence;
    }

    public int getCurrentMagicalDefence() {
        return currentMagicalDefence;
    }

    public Equipment[] getEquipments() {
        return equipments;
    }


    public Skill[] getSkills() {
        return skills;
    }

    public void applyEquipment(Equipment equipment){
        if (equipment instanceof DefenceEquipment)
            applyDefenceEquipment((DefenceEquipment) equipment);
    }

    private void applyDefenceEquipment(DefenceEquipment defenceEquipment) {
        increaseCurrentPhysicalDefenceBy(defenceEquipment.getPhysicalDefence());
        increaseCurrentMagicalDefenceBy(defenceEquipment.getMagicalDefence());
        increaseCurrentHpBy(defenceEquipment.getHp());
        increaseCurrentSpBy(defenceEquipment.getSp());
    }


    public void decreaseHpBy(int attack) {
        currentHp -= attack;
    }
}

package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Equipments.*;
import MobaGame.Skills.Skill;

public class Hero {
    private String heroName;
    private int baseHp;
    private int currentHp;
    private int baseSp;
    private int currentSp;
    private int baseSkillDamage;
    private int baseRange;
    private int basePhysicalDefence;
    private int baseMagicalDefence;
    private int currentPhysicalDefence;
    private int currentMagicalDefence;
    private int baseSpeed;
    private int currentSpeed;
    private int baseAttackSpeed;
    private int currentAttackSpeed;
    private final static int MAX_EQUIPMENT = 4;
    private final static int MAX_ARCANA = 10;
    private Equipment[] equipments;
    private Arcana[] arcanas;
    private Skill[] skills;


    Hero(){

    }

    public Hero(String heroName, int baseHp, int baseSp, int baseSkillDamage, int baseRange, int basePhysicalDefence, int baseMagicalDefence, int baseSpeed, int baseAttackSpeed, Skill[] skills) {
        this.heroName = heroName;
        this.baseHp = baseHp;
        this.currentHp = baseHp;
        this.baseSp = baseSp;
        this.currentSp = baseSp;
        this.baseSkillDamage = baseSkillDamage;
        this.baseRange = baseRange;
        this.basePhysicalDefence = basePhysicalDefence;
        this.baseMagicalDefence = baseMagicalDefence;
        this.currentPhysicalDefence = basePhysicalDefence;
        this.currentMagicalDefence = baseMagicalDefence;
        this.baseSpeed = baseSpeed;
        this.currentSpeed = baseSpeed;
        this.baseAttackSpeed = baseAttackSpeed;
        this.currentAttackSpeed = baseAttackSpeed;
        this.skills = skills;
        equipments = new Equipment[MAX_EQUIPMENT];
        arcanas = new Arcana[MAX_ARCANA];
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

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void increaseCurrentAttackSpeedBy(int currentAttackSpeed) {
        this.currentAttackSpeed += currentAttackSpeed;
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

    public int getBaseSkillDamage() {
        return baseSkillDamage;
    }

    public int getBaseRange() {
        return baseRange;
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

    public int getBaseSpeed() {
        return baseSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getBaseAttackSpeed() {
        return baseAttackSpeed;
    }

    public int getCurrentAttackSpeed() {
        return currentAttackSpeed;
    }

    public Equipment[] getEquipments() {
        return equipments;
    }

    public Arcana[] getArcanas() {
        return arcanas;
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
}

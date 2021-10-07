package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Equipments.Equipment;
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
    private Equipment[] equipments;
    private Arcana[] arcanas;
    private Skill[] skills;

    Hero(){

    }

    public Hero(String heroName, int baseHp, int baseSp, int baseSkillDamage, int baseRange, int basePhysicalDefence, int baseMagicalDefence, int baseSpeed, int baseAttackSpeed, Equipment[] equipments, Arcana[] arcanas, Skill[] skills) {
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
        this.equipments = equipments;
        this.arcanas = arcanas;
        this.skills = skills;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public void setCurrentSp(int currentSp) {
        this.currentSp = currentSp;
    }

    public void setCurrentPhysicalDefence(int currentPhysicalDefence) {
        this.currentPhysicalDefence = currentPhysicalDefence;
    }

    public void setCurrentMagicalDefence(int currentMagicalDefence) {
        this.currentMagicalDefence = currentMagicalDefence;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentAttackSpeed(int currentAttackSpeed) {
        this.currentAttackSpeed = currentAttackSpeed;
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
}

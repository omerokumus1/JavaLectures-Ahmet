package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Equipments.Equipment;
import MobaGame.Skills.Skill;

public class Mage extends Hero {
    private int baseMagicalDamage;
    private int currentMagicalDamage;
    private int currentRange;

    public Mage(String heroName, int baseHp, int baseSp, int baseSkillDamage, int baseRange, int basePhysicalDefence, int baseMagicalDefence, int baseSpeed, int baseAttackSpeed, Equipment[] equipments, Arcana[] arcanas, Skill[] skills, int baseMagicalDamage) {
        super(heroName, baseHp, baseSp, baseSkillDamage, baseRange, basePhysicalDefence, baseMagicalDefence, baseSpeed, baseAttackSpeed, equipments, arcanas, skills);
        this.baseMagicalDamage = baseMagicalDamage;
        this.currentMagicalDamage = baseMagicalDamage;
        this.currentRange = baseRange;
    }

    public void setCurrentMagicalDamage(int currentMagicalDamage) {
        this.currentMagicalDamage = currentMagicalDamage;
    }

    public void setCurrentRange(int currentRange) {
        this.currentRange = currentRange;
    }

    public int getBaseMagicalDamage() {
        return baseMagicalDamage;
    }

    public int getCurrentMagicalDamage() {
        return currentMagicalDamage;
    }

    public int getCurrentRange() {
        return currentRange;
    }
}

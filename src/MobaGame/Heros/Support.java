package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Equipments.Equipment;
import MobaGame.Skills.Skill;

public class Support extends Hero {
    private int basePhysicalDamage;
    private int currentPhysicalDamage;
    private int supportingLevel;

    public Support(String heroName, int baseHp, int baseSp, int baseSkillDamage, int baseRange, int basePhysicalDefence, int baseMagicalDefence, int baseSpeed, int baseAttackSpeed, Equipment[] equipments, Arcana[] arcanas, Skill[] skills, int basePhysicalDamage, int supportingLevel) {
        super(heroName, baseHp, baseSp, baseSkillDamage, baseRange, basePhysicalDefence, baseMagicalDefence, baseSpeed, baseAttackSpeed, equipments, arcanas, skills);
        this.basePhysicalDamage = basePhysicalDamage;
        this.currentPhysicalDamage = basePhysicalDamage;
        this.supportingLevel = supportingLevel;
    }

    public void setCurrentPhysicalDamage(int currentPhysicalDamage) {
        this.currentPhysicalDamage = currentPhysicalDamage;
    }

    public int getBasePhysicalDamage() {
        return basePhysicalDamage;
    }

    public int getCurrentPhysicalDamage() {
        return currentPhysicalDamage;
    }

    public int getSupportingLevel() {
        return supportingLevel;
    }
}

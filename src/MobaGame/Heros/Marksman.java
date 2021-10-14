package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Arcanas.PhysicalAttackArcana;
import MobaGame.Equipments.AttackEquipment;
import MobaGame.Equipments.Equipment;
import MobaGame.Equipments.PhysicalAttackEquipment;
import MobaGame.Skills.Skill;

public class Marksman extends PhysicalAttackHero {

    private int currentRange;

    public Marksman(String heroName, int baseHp, int baseSp, int baseSkillDamage, int baseRange, int basePhysicalDefence, int baseMagicalDefence, int baseSpeed, int baseAttackSpeed, Skill[] skills, int basePhysicalAttack) {
        super(heroName, baseHp, baseSp, baseSkillDamage, baseRange, basePhysicalDefence, baseMagicalDefence, baseSpeed, baseAttackSpeed, skills, basePhysicalAttack);
        this.currentRange = baseRange;
    }


    public void setCurrentRange(int currentRange) {
        this.currentRange = currentRange;
    }


    public int getCurrentRange() {
        return currentRange;
    }
}

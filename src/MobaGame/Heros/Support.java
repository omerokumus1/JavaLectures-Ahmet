package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Equipments.AttackEquipment;
import MobaGame.Equipments.Equipment;
import MobaGame.Equipments.PhysicalAttackEquipment;
import MobaGame.Skills.Skill;

public class Support extends Hero {
    private int basePhysicalAttack;
    private int currentPhysicalAttack;
    private int supportingLevel;

    public Support(String heroName, int baseHp, int baseSp, int baseSkillAttack, int baseRange, int basePhysicalDefence, int baseMagicalDefence, int baseSpeed, int baseAttackSpeed,  Skill[] skills, int basePhysicalAttack, int supportingLevel) {
        super(heroName, baseHp, baseSp, baseSkillAttack, baseRange, basePhysicalDefence, baseMagicalDefence, baseSpeed, baseAttackSpeed,  skills);
        this.basePhysicalAttack = basePhysicalAttack;
        this.currentPhysicalAttack = basePhysicalAttack;
        this.supportingLevel = supportingLevel;
    }

    @Override
    public void applyEquipment(Equipment equipment) {
        super.applyEquipment(equipment);
        if (equipment instanceof PhysicalAttackEquipment){
            applyAttackEquipment((AttackEquipment) equipment);
            applyPhysicalAttackEquipment((PhysicalAttackEquipment) equipment);
        }
    }

    private void applyAttackEquipment(AttackEquipment attackEquipment) {
        increaseCurrentAttackSpeedBy(attackEquipment.getAttackSpeed());
    }

    private void applyPhysicalAttackEquipment(PhysicalAttackEquipment physicalAttackEquipment) {
        increaseCurrentPhysicalAttackBy(physicalAttackEquipment.getPhysicalAttack());
    }

    public void increaseCurrentPhysicalAttackBy(int currentPhysicalAttack) {
        this.currentPhysicalAttack += currentPhysicalAttack;
    }

    public int getBasePhysicalAttack() {
        return basePhysicalAttack;
    }

    public int getCurrentPhysicalAttack() {
        return currentPhysicalAttack;
    }

    public int getSupportingLevel() {
        return supportingLevel;
    }
}

package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Equipments.AttackEquipment;
import MobaGame.Equipments.Equipment;
import MobaGame.Equipments.PhysicalAttackEquipment;
import MobaGame.Skills.Skill;

public class Marksman extends Hero {
    private int basePhysicalAttack;
    private int currentPhysicalAttack;
    private int currentRange;

    public Marksman(String heroName, int baseHp, int baseSp, int baseSkillAttack, int baseRange, int basePhysicalDefence, int baseMagicalDefence, int baseSpeed, int baseAttackSpeed, Skill[] skills, int basePhysicalAttack) {
        super(heroName, baseHp, baseSp, baseSkillAttack, baseRange, basePhysicalDefence, baseMagicalDefence, baseSpeed, baseAttackSpeed, skills);
        this.basePhysicalAttack = basePhysicalAttack;
        this.currentPhysicalAttack = basePhysicalAttack;
        this.currentRange = baseRange;
    }

    @Override
    public void applyEquipment(Equipment equipment) {
        super.applyEquipment(equipment);
        if (equipment instanceof PhysicalAttackEquipment){
            applyAttackEquipment((AttackEquipment) equipment);
            applyAttackEquipment((PhysicalAttackEquipment) equipment);
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

    public void setCurrentRange(int currentRange) {
        this.currentRange = currentRange;
    }

    public int getBasePhysicalAttack() {
        return basePhysicalAttack;
    }

    public int getCurrentPhysicalAttack() {
        return currentPhysicalAttack;
    }

    public int getCurrentRange() {
        return currentRange;
    }
}

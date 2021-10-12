package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Equipments.AttackEquipment;
import MobaGame.Equipments.Equipment;
import MobaGame.Equipments.PhysicalAttackEquipment;
import MobaGame.Skills.Skill;

public class Assassin extends Hero {
    private int basePhysicalAttack;
    private int currentPhysicalAttack;

    public Assassin(String heroName, int baseHp, int baseSp, int baseSkillAttack, int baseRange, int basePhysicalDefence, int baseMagicalDefence, int baseSpeed, int baseAttackSpeed, Equipment[] equipments, Arcana[] arcanas, Skill[] skills, int basePhysicalAttack) {
        super(heroName, baseHp, baseSp, baseSkillAttack, baseRange, basePhysicalDefence, baseMagicalDefence, baseSpeed, baseAttackSpeed, equipments, arcanas, skills);
        this.basePhysicalAttack = basePhysicalAttack;
        this.currentPhysicalAttack = basePhysicalAttack;
    }

    @Override
    public void applyEquipment(Equipment equipment){

    }

    @Override
    public void applyEquipment() {
        super.applyEquipment();
        Equipment[] equipments = getEquipments();
        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i] instanceof PhysicalAttackEquipment) {
                applyAttackEquipment((PhysicalAttackEquipment)equipments[i]);
                applyPhysicalAttackEquipment((PhysicalAttackEquipment) equipments[i]);
            }
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
}

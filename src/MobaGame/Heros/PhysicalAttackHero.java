package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Arcanas.PhysicalAttackArcana;
import MobaGame.Equipments.AttackEquipment;
import MobaGame.Equipments.Equipment;
import MobaGame.Equipments.PhysicalAttackEquipment;
import MobaGame.Skills.Skill;

public class PhysicalAttackHero extends Hero{
    private int basePhysicalAttack;
    private int currentPhysicalAttack;


    public PhysicalAttackHero(String heroName, int baseHp, int baseSp, int baseSkillDamage, int baseRange, int basePhysicalDefence, int baseMagicalDefence, int baseSpeed, int baseAttackSpeed, Skill[] skills, int basePhysicalAttack) {
        super(heroName, baseHp, baseSp, baseSkillDamage, baseRange, basePhysicalDefence, baseMagicalDefence, baseSpeed, baseAttackSpeed, skills);
        this.basePhysicalAttack = basePhysicalAttack;
        this.currentPhysicalAttack = basePhysicalAttack;
    }

    @Override
    public void applyArcana(Arcana arcana) {
        super.applyArcana(arcana);
        if (arcana instanceof PhysicalAttackArcana){
            applyPhysicalAttackArcana((PhysicalAttackArcana) arcana);
        }
    }

    private void applyPhysicalAttackArcana(PhysicalAttackArcana physicalAttackArcana) {
        increaseCurrentPhysicalAttackBy(physicalAttackArcana.getAttack());
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
        /*public void applyEquipments(Equipment[] equipments){
        for (int i = 0; i < equipments.length; i++) {
            applyEquipment(equipments[i]);
        }
    }*/

    public int getBasePhysicalAttack() {
        return basePhysicalAttack;
    }

    public int getCurrentPhysicalAttack() {
        return currentPhysicalAttack;
    }

    public void increaseCurrentPhysicalAttackBy(int currentPhysicalAttack) {
        this.currentPhysicalAttack += currentPhysicalAttack;
    }
}

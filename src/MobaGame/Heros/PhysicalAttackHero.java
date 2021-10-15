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


    public PhysicalAttackHero(String heroName, int baseHp, int baseSp, int basePhysicalDefence, int baseMagicalDefence, Skill[] skills, int basePhysicalAttack) {
        super(heroName, baseHp, baseSp, basePhysicalDefence, baseMagicalDefence, skills);
        this.basePhysicalAttack = basePhysicalAttack;
        this.currentPhysicalAttack = basePhysicalAttack;
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

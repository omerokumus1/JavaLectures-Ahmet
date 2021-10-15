package MobaGame.Heros;

import MobaGame.Equipments.Equipment;
import MobaGame.Equipments.MagicalAttackEquipment;
import MobaGame.Skills.Skill;

public class Mage extends Hero {
    private int baseMagicalAttack;
    private int currentMagicalAttack;

    public Mage(String heroName, int baseHp, int baseSp, int basePhysicalDefence, int baseMagicalDefence, Skill[] skills, int baseMagicalAttack) {
        super(heroName, baseHp, baseSp, basePhysicalDefence, baseMagicalDefence, skills);
        this.baseMagicalAttack = baseMagicalAttack;
        this.currentMagicalAttack = baseMagicalAttack;
    }




    @Override
    public void applyEquipment(Equipment equipment) {
        super.applyEquipment(equipment);
        if (equipment instanceof MagicalAttackEquipment){
            applyAttackEquipment((MagicalAttackEquipment) equipment);
            applyMagicalAttackEquipment((MagicalAttackEquipment) equipment);
        }
    }



    private void applyMagicalAttackEquipment(MagicalAttackEquipment magicalAttackEquipment) {
        increaseCurrentMagicalAttackBy(magicalAttackEquipment.getMagicalAttack());
    }

    private void applyAttackEquipment(MagicalAttackEquipment magicalAttackEquipment) {

    }

    public void increaseCurrentMagicalAttackBy(int currentMagicalAttack) {
        this.currentMagicalAttack += currentMagicalAttack;
    }

    public int getBaseMagicalAttack() {
        return baseMagicalAttack;
    }

    public int getCurrentMagicalAttack() {
        return currentMagicalAttack;
    }

}

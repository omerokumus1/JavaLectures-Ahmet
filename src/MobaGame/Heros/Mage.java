package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Arcanas.MagicalAttackArcana;
import MobaGame.Arcanas.PhysicalAttackArcana;
import MobaGame.Equipments.Equipment;
import MobaGame.Equipments.MagicalAttackEquipment;
import MobaGame.Skills.Skill;

public class Mage extends Hero {
    private int baseMagicalAttack;
    private int currentMagicalAttack;
    private int currentRange;

    public Mage(String heroName, int baseHp, int baseSp, int baseSkillAttack, int baseRange, int basePhysicalDefence, int baseMagicalDefence, int baseSpeed, int baseAttackSpeed, Skill[] skills, int baseMagicalAttack) {
        super(heroName, baseHp, baseSp, baseSkillAttack, baseRange, basePhysicalDefence, baseMagicalDefence, baseSpeed, baseAttackSpeed, skills);
        this.baseMagicalAttack = baseMagicalAttack;
        this.currentMagicalAttack = baseMagicalAttack;
        this.currentRange = baseRange;
    }

    @Override
    public void applyArcana(Arcana arcana) {
        super.applyArcana(arcana);
        if (arcana instanceof MagicalAttackArcana){
            applyMagicalAttackArcana((MagicalAttackArcana) arcana);
        }
    }

    private void applyMagicalAttackArcana(MagicalAttackArcana physicalAttackArcana) {
        increaseCurrentMagicalAttackBy(physicalAttackArcana.getAttack());
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
        increaseCurrentAttackSpeedBy(magicalAttackEquipment.getAttackSpeed());
    }

    public void increaseCurrentMagicalAttackBy(int currentMagicalAttack) {
        this.currentMagicalAttack += currentMagicalAttack;
    }

    public void setCurrentRange(int currentRange) {
        this.currentRange = currentRange;
    }

    public int getBaseMagicalAttack() {
        return baseMagicalAttack;
    }

    public int getCurrentMagicalAttack() {
        return currentMagicalAttack;
    }

    public int getCurrentRange() {
        return currentRange;
    }
}

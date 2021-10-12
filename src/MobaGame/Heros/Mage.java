package MobaGame.Heros;

import MobaGame.Arcanas.Arcana;
import MobaGame.Equipments.Equipment;
import MobaGame.Equipments.MagicalAttackEquipment;
import MobaGame.Equipments.PhysicalAttackEquipment;
import MobaGame.Skills.Skill;

public class Mage extends Hero {
    private int baseMagicalAttack;
    private int currentMagicalAttack;
    private int currentRange;

    public Mage(String heroName, int baseHp, int baseSp, int baseSkillAttack, int baseRange, int basePhysicalDefence, int baseMagicalDefence, int baseSpeed, int baseAttackSpeed, Equipment[] equipments, Arcana[] arcanas, Skill[] skills, int baseMagicalAttack) {
        super(heroName, baseHp, baseSp, baseSkillAttack, baseRange, basePhysicalDefence, baseMagicalDefence, baseSpeed, baseAttackSpeed, equipments, arcanas, skills);
        this.baseMagicalAttack = baseMagicalAttack;
        this.currentMagicalAttack = baseMagicalAttack;
        this.currentRange = baseRange;
    }

    @Override
    public void applyEquipment() {
        super.applyEquipment();
        Equipment[] equipments = getEquipments();
        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i] instanceof MagicalAttackEquipment) {
                applyAttackEquipment((MagicalAttackEquipment)equipments[i]);
                applyMagicalAttackEquipment((MagicalAttackEquipment) equipments[i]);
            }
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

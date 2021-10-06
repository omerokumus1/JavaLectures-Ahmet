package MobaGame.Equipments;

import MobaGame.Utility;

public class PhysicalAttackEquipment extends AttackEquipment {
    private int physicalDamage;
    private final static int PHYSICAL_DAMAGE_UPPER_BOUND = 150;
    private final static int PHYSICAL_DAMAGE_LOWER_BOUND = 30;

    PhysicalAttackEquipment(){
        this(0,0,0);
    }

    PhysicalAttackEquipment(int price, int attackSpeed, int physicalDamage) {
        super(price, attackSpeed);
        setPhysicalDamage(physicalDamage);
    }

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public void setPhysicalDamage(int physicalDamage) {
        this.physicalDamage = Utility.specifyAttributeValue(PHYSICAL_DAMAGE_LOWER_BOUND, PHYSICAL_DAMAGE_UPPER_BOUND, physicalDamage);
    }
}

package MobaGame.Equipments;

import MobaGame.Utility;

public class PhysicalAttackEquipment extends AttackEquipment {
    private int physicalAttack;
    private final static int PHYSICAL_DAMAGE_UPPER_BOUND = 150;
    private final static int PHYSICAL_DAMAGE_LOWER_BOUND = 30;

    PhysicalAttackEquipment(){
        this(0,0,0);
    }

    public PhysicalAttackEquipment(int price, int attackSpeed, int physicalAttack) {
        super(price, attackSpeed);
        setPhysicalAttack(physicalAttack);
    }

    public int getPhysicalAttack() {
        return physicalAttack;
    }

    public void setPhysicalAttack(int physicalAttack) {
        this.physicalAttack = Utility.specifyAttributeValue(PHYSICAL_DAMAGE_LOWER_BOUND, PHYSICAL_DAMAGE_UPPER_BOUND, physicalAttack);
    }
}

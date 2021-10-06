package MobaGame.Equipments;

import MobaGame.Utility;

public class AttackEquipment extends Equipment {
    private int attackSpeed;
    private final static int ATTACK_SPEED_UPPER_BOUND = 100;
    private final static int ATTACK_SPEED_LOWER_BOUND = 0;


    AttackEquipment() {
        this(0,0);
    }

    AttackEquipment(int price, int attackSpeed) {
        super(price);
        setAttackSpeed(attackSpeed);

    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = Utility.specifyAttributeValue(ATTACK_SPEED_LOWER_BOUND, ATTACK_SPEED_UPPER_BOUND, attackSpeed);
    }



}

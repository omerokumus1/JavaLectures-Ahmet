package MobaGame.Equipments;

import MobaGame.Utility;

public class MagicalAttackEquipment extends AttackEquipment {
    private int magicalAttack;
    private final static int MAGICAL_DAMAGE_UPPER_BOUND = 200;
    private final static int MAGICAL_DAMAGE_LOWER_BOUND = 10;

    public MagicalAttackEquipment(){
        this(0,0);
    }

    public MagicalAttackEquipment(int price,int magicalAttack){
        super(price);
        setMagicalAttack(magicalAttack);
    }

    public int getMagicalAttack() {
        return magicalAttack;
    }

    public void setMagicalAttack(int magicalAttack) {
        this.magicalAttack = Utility.specifyAttributeValue(MAGICAL_DAMAGE_LOWER_BOUND, MAGICAL_DAMAGE_UPPER_BOUND, magicalAttack);
    }
}

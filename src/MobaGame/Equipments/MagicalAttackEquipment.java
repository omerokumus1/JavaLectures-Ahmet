package MobaGame.Equipments;

import MobaGame.Utility;

public class MagicalAttackEquipment extends AttackEquipment {
    private int magicalDamage;
    private final static int MAGICAL_DAMAGE_UPPER_BOUND = 200;
    private final static int MAGICAL_DAMAGE_LOWER_BOUND = 10;

    MagicalAttackEquipment(){
        this(0,0,0);
    }

    MagicalAttackEquipment(int price, int attackSpeed,int magicalDamage){
        super(price, attackSpeed);
        setMagicalDamage(magicalDamage);
    }

    public int getMagicalDamage() {
        return magicalDamage;
    }

    public void setMagicalDamage(int magicalDamage) {
        this.magicalDamage = Utility.specifyAttributeValue(MAGICAL_DAMAGE_LOWER_BOUND, MAGICAL_DAMAGE_UPPER_BOUND, magicalDamage);
    }
}

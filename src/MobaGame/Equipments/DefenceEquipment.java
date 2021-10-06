package MobaGame.Equipments;

import MobaGame.Utility;

public class DefenceEquipment extends Equipment {
    private int physicalDefence;
    private int magicalDefence;
    private int hp;
    private int sp;
    private final static int PHYSICAL_DEFENCE_UPPER_BOUND = 100;
    private final static int PHYSICAL_DEFENCE_LOWER_BOUND = 10;
    private final static int MAGICAL_DEFENCE_UPPER_BOUND = 150;
    private final static int MAGICAL_DEFENCE_LOWER_BOUND = 15;
    private final static int HP_UPPER_BOUND = 150;
    private final static int HP_LOWER_BOUND = 15;
    private final static int SP_UPPER_BOUND = 30;
    private final static int SP_LOWER_BOUND = 10;

    DefenceEquipment(){
        this(0,0,0,0,0);
    }

    DefenceEquipment(int price, int physicalDefence, int magicalDefence, int hp, int sp){
        super(price);
        setPhysicalDefence(physicalDefence);
        setMagicalDefence(magicalDefence);
        setHp(hp);
        setSp(sp);
    }

    public int getPhysicalDefence() {
        return physicalDefence;
    }

    public void setPhysicalDefence(int physicalDefence) {
        this.physicalDefence = Utility.specifyAttributeValue(PHYSICAL_DEFENCE_LOWER_BOUND, PHYSICAL_DEFENCE_UPPER_BOUND, physicalDefence);
    }

    public int getMagicalDefence() {
        return magicalDefence;
    }

    public void setMagicalDefence(int magicalDefence) {
        this.magicalDefence = Utility.specifyAttributeValue(MAGICAL_DEFENCE_LOWER_BOUND, MAGICAL_DEFENCE_UPPER_BOUND, magicalDefence);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Utility.specifyAttributeValue(HP_LOWER_BOUND, HP_UPPER_BOUND, hp);
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = Utility.specifyAttributeValue(SP_LOWER_BOUND, SP_UPPER_BOUND, sp);
    }

}

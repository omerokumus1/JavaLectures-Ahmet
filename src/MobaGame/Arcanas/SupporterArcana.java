package MobaGame.Arcanas;

import MobaGame.Utility;

public class SupporterArcana extends Arcana {
    private int hp;
    private int sp;
    private final static int HP_UPPER_BOUND = 100;
    private final static int HP_LOWER_BOUND = 20;
    private final static int SP_UPPER_BOUND = 40;
    private final static int SP_LOWER_BOUND = 10;

    SupporterArcana(){

    }

    SupporterArcana(int hp, int sp){
        setHp(hp);
        setSp(sp);
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

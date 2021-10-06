package MobaGame.Skills;

import MobaGame.Utility;

public class Skill {
    private int sp;
    private final static int SP_UPPER_BOUND = 100;
    private final static int SP_LOWER_BOUND = 20;

    Skill(){
        this(0);
    }

    Skill(int sp){
        setSp(sp);
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = Utility.specifyAttributeValue(SP_LOWER_BOUND, SP_UPPER_BOUND, sp);
    }
}

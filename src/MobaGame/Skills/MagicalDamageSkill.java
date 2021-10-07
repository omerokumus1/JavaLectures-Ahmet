package MobaGame.Skills;

import MobaGame.Utility;

public class MagicalDamageSkill extends Skill {
    private int magicalDamagePercent;
    private final static int MAGICAL_DAMAGE_PERCENT_UPPER_BOUND = 30;
    private final static int MAGICAL_DAMAGE_PERCENT_LOWER_BOUND = 5;

    public MagicalDamageSkill(){
        this("Unknown",0,0);
    }

    public MagicalDamageSkill(String name, int sp, int magicalDamagePercent){
        super(name, sp);
        setMagicalDamagePercent(magicalDamagePercent);
    }

    public int getMagicalDamagePercent() {
        return magicalDamagePercent;
    }

    public void setMagicalDamagePercent(int magicalDamagePercent) {
        this.magicalDamagePercent = Utility.specifyAttributeValue(MAGICAL_DAMAGE_PERCENT_LOWER_BOUND, MAGICAL_DAMAGE_PERCENT_UPPER_BOUND, magicalDamagePercent);
    }
}

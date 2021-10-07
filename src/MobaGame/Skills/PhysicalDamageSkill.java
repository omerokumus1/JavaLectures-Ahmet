package MobaGame.Skills;

import MobaGame.Utility;

public class PhysicalDamageSkill extends Skill {
    private int physicalDamagePercent;
    private final static int PHYSICAL_DAMAGE_PERCENT_UPPER_BOUND = 30;
    private final static int PHYSICAL_DAMAGE_PERCENT_LOWER_BOUND = 5;

    public PhysicalDamageSkill(){
        this("Unknown",0,0);
    }
    public PhysicalDamageSkill(String name, int sp, int physicalDamagePercent){
        super(name, sp);
        setPhysicalDamagePercent(physicalDamagePercent);
    }

    public int getPhysicalDamagePercent() {
        return physicalDamagePercent;
    }

    public void setPhysicalDamagePercent(int physicalDamagePercent) {
        this.physicalDamagePercent = Utility.specifyAttributeValue(PHYSICAL_DAMAGE_PERCENT_UPPER_BOUND, PHYSICAL_DAMAGE_PERCENT_LOWER_BOUND, physicalDamagePercent);
    }
}

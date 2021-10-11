package MobaGame.Skills;

import MobaGame.Utility;

public class SupportingSkill extends Skill {
    private int hpIncrease;
    private int physicalDefenceIncrease;
    private int magicalDefenceIncrease;

    private final static int HP_INCREASE_UPPER_BOUND = 1000;
    private final static int HP_INCREASE_LOWER_BOUND = 0;
    private final static int PHYSICAL_DEFENCE_INCREASE_UPPER_BOUND = 500;
    private final static int PHYSICAL_DEFENCE_LOWER_BOUND = 0;
    private final static int MAGICAL_DEFENCE_UPPER_BOUND = 500;
    private final static int MAGICAL_DEFENCE_LOWER_BOUND = 0;

    SupportingSkill(){
        this("Unknown", 0,0,0,0);
    }
    SupportingSkill(String name, int sp, int hpIncrease, int physicalDefenceIncrease, int magicalDefenceIncrease){
        super(name, sp);
        setHpIncrease(hpIncrease);
        setPhysicalDefenceIncrease(physicalDefenceIncrease);
        setMagicalDefenceIncrease(magicalDefenceIncrease);
    }

    public int getHpIncrease() {
        return hpIncrease;
    }

    public void setHpIncrease(int hpIncrease) {
        this.hpIncrease = Utility.specifyAttributeValue(HP_INCREASE_LOWER_BOUND, HP_INCREASE_UPPER_BOUND, hpIncrease);
    }

    public int getPhysicalDefenceIncrease() {
        return physicalDefenceIncrease;
    }

    public void setPhysicalDefenceIncrease(int physicalDefenceIncrease) {
        this.physicalDefenceIncrease = Utility.specifyAttributeValue(PHYSICAL_DEFENCE_LOWER_BOUND, PHYSICAL_DEFENCE_INCREASE_UPPER_BOUND, physicalDefenceIncrease);
    }

    public int getMagicalDefenceIncrease() {
        return magicalDefenceIncrease;
    }

    public void setMagicalDefenceIncrease(int magicalDefenceIncrease) {
        this.magicalDefenceIncrease = Utility.specifyAttributeValue(MAGICAL_DEFENCE_LOWER_BOUND, MAGICAL_DEFENCE_UPPER_BOUND, magicalDefenceIncrease);
    }

}

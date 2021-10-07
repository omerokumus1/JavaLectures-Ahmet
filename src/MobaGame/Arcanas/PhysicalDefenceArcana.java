package MobaGame.Arcanas;

import MobaGame.Utility;

public class PhysicalDefenceArcana extends DefenceArcana {
    private final static int DEFENCE_UPPER_BOUND = 15;
    private final static int DEFENCE_LOWER_BOUND = 3;

    PhysicalDefenceArcana() {
        this(0);
    }

    PhysicalDefenceArcana(int defence) {
        setDefence(defence);
    }

    @Override
    public void setDefence(int defence) {
        super.setDefence(Utility.specifyAttributeValue(DEFENCE_LOWER_BOUND, DEFENCE_UPPER_BOUND, defence));
    }
}

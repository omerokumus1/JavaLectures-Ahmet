package MobaGame.Arcanas;

import MobaGame.Utility;

public class MagicalDefenceArcana extends DefenceArcana {
    private final static int DEFENCE_UPPER_BOUND = 20;
    private final static int DEFENCE_LOWER_BOUND = 1;

    MagicalDefenceArcana() {
        this(0);
    }

    MagicalDefenceArcana(int defence) {
        setDefence(defence);
    }

    @Override
    public void setDefence(int defence) {
        super.setDefence(Utility.specifyAttributeValue(DEFENCE_LOWER_BOUND, DEFENCE_UPPER_BOUND, defence));
    }
}

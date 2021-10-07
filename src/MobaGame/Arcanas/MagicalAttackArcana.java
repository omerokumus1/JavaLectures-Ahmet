package MobaGame.Arcanas;

import MobaGame.Utility;

public class MagicalAttackArcana extends AttackArcana {
    private final static int ATTACK_UPPER_BOUND = 20;
    private final static int ATTACK_LOWER_BOUND = 1;

    public MagicalAttackArcana() {
        this(0);
    }

    public MagicalAttackArcana(int attack) {
        setAttack(attack);
    }

    @Override
    public void setAttack(int attack) {
        super.setAttack(Utility.specifyAttributeValue(ATTACK_LOWER_BOUND, ATTACK_UPPER_BOUND, attack));
    }
}

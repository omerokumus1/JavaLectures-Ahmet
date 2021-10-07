package MobaGame.Arcanas;

import MobaGame.Utility;

public class PhysicalAttackArcana extends AttackArcana {

    private final static int ATTACK_UPPER_BOUND = 15;
    private final static int ATTACK_LOWER_BOUND = 3;

    public PhysicalAttackArcana() {
        this(0);
    }

    public PhysicalAttackArcana(int attack) {
        setAttack(attack);
    }

    @Override
    public void setAttack(int attack) {
        super.setAttack(Utility.specifyAttributeValue(ATTACK_LOWER_BOUND, ATTACK_UPPER_BOUND, attack));
    }
}

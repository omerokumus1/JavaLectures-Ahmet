package MobaGame.Arcanas;

public class Arcana {
    private final static int cost = 1000;
    private int level = 1;
    private int neededArcanaFragment = 200;
    private static final int[] neededFragmentsForUpdate = {200, 500, 800};

    public int getLevel() {
        return level;
    }

    public void updateArcana() {
        if (level <= 3) {
            level++;
            neededArcanaFragment = neededFragmentsForUpdate[level - 1];
        }

    }

    public int getNeededArcanaFragment() {
        return neededArcanaFragment;
    }

    public int getCost() {
        return cost;
    }
}

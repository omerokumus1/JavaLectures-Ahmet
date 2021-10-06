package MobaGame.Equipments;

import MobaGame.Utility;

import java.security.UnresolvedPermission;

public class Equipment {
    private int price;
    private final static int PRICE_UPPER_BOUND = 2000;
    private final static int PRICE_LOWER_BOUND = 100;

    Equipment() {
        this(0);
    }

    Equipment(int price) {
        setPrice(price);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Utility.specifyAttributeValue(PRICE_LOWER_BOUND, PRICE_UPPER_BOUND, price);
    }


}

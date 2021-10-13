package MobaGame;

public class Utility {
    public static int specifyAttributeValue(int lowerLimit, int upperLimit, int value) {
        if (value > upperLimit)
            return upperLimit;
        else if (value < lowerLimit)
            return lowerLimit;
        else
            return value;
    }


}

package JavaMaps;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesOfLetters {
    public static void main(String[] args) {
        String text = "Good morning. Have a good class. " +
                 "Have a good visit. Have fun!";
        Map<Character, Integer> occurrencesMap = new HashMap<>();
        int value;
        int newValue;
        for (int i = 0; i < text.length(); i++) {
            Character letter = text.charAt(i);
            if (occurrencesMap.containsKey(letter))
            {
                value = occurrencesMap.get(letter);
                newValue = value + 1;
                occurrencesMap.put(letter, newValue);
            }
            else{
                occurrencesMap.put(letter, 1);
            }
        }
        System.out.println(occurrencesMap);
    } // 'G': 1, 'o': 7
}

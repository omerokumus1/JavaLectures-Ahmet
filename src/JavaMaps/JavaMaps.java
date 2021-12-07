package JavaMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaMaps {
    public static void main(String[] args) {
        Map<Character, Integer> characterMap = new HashMap<>();
        characterMap.put('A', 65);
        characterMap.put('B', 66);
        characterMap.put('C', 67);
        characterMap.put('D', 68);
        characterMap.put('E', 69);
        characterMap.put('F', 70);

        System.out.println("ASCII code of A: " + characterMap.get('A'));

        Set<Character> keySet = characterMap.keySet();
        for (Character key :
                keySet) {
            System.out.println("Key: " + key + ", Value:" + characterMap.get(key));
        }
    }
}

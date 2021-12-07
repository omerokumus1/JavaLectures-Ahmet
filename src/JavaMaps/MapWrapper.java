package JavaMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapWrapper extends HashMap{
    Map<String, String> mapWrapper;

    MapWrapper(Map<String, String> map){
        mapWrapper = map;
    }
    MapWrapper(){

    }

    public ArrayList<String> getKeysAsArrayList(){
        Set<String> keySet = mapWrapper.keySet();
        ArrayList<String> keyList = new ArrayList<>();
//        for (String key :
//                keySet) {
//            keyList.add(key);
//        }
        // identical to foreach
        keyList.addAll(keySet);
        return keyList;
    }
}

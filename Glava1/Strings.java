package Glava1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Strings {
    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }
    public static Map<Character, Integer> countDuplicator(String str){

        if(str == null || str.isBlank()){
            return Collections.emptyMap();
        }
        Map<Character, Integer> result = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            result.compute(ch, (k,v)->(v == null) ? 1 : ++v);
        }
        return result;
    }

}

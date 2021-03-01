package dr.puzzles.set1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AnagramCheck {
    private static final String ALPHA_ONLY = "[^a-zA-Z]+";

    public boolean simpleCheck(String s1, String s2) {

        String input1 = s1.replaceAll(ALPHA_ONLY, "").trim().toLowerCase(Locale.ROOT);
        String input2 = s2.replaceAll(ALPHA_ONLY, "").trim().toLowerCase(Locale.ROOT);

        Map<Character, Integer> map1 = stringToMap(input1);
        Map<Character, Integer> map2 = stringToMap(input2);

        if(map1.size() != map2.size())
            return false;

        for (Character c : map1.keySet()) {
            if (map2.get(c) == null || !map2.get(c).equals(map1.get(c)))
                return false;
        }

        return true;
    }

    private Map<Character, Integer> stringToMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character temp = s.charAt(i);
            map.merge(temp, 1, Integer::sum);
        }
        return map;
    }
}

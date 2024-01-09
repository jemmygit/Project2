package Project2;

import java.util.HashMap;
import java.util.Map;

/*
Find the First Non-Repeating Character in a String: Given a string, find and
return the first non-repeating character. For example, in the string
"abracadabra", the first non-repeating character is 'c'.
 */
public class T9 {
    public static void main(String[] args) {
        String str="abracadabra";
        char firstNonRepeatingChar=findfirstNonRepeatingChar(str);
        System.out.println("First non-repeating character "+firstNonRepeatingChar);
    }
    public static char findfirstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }
        return 0;
    }
}


package Project2;

import java.util.Arrays;

/*
 Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams
 */
public class T5 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char[] charArray1 = new char[0];
        char[] charArray2 = new char[0];
        if (str1.length() == str2.length()) {
            charArray1 = str1.toCharArray();
            charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

        }
        boolean b = Arrays.equals(charArray1, charArray2);
        if (b){System.out.println(str1+" "+" and "+ str2 + " are anagrams");}
        else{{System.out.println(str1+" "+ " " +str2 + " are not anagrams");}}

    }
}

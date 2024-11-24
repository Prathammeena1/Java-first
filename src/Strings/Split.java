package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Split {

    public static String Capitalize(String s) {
        if (s.length() <= 2) return s.toUpperCase();

        char[] arr = s.toCharArray();
        int n = arr.length;
        arr[0] = Character.toUpperCase(arr[0]);
        arr[n - 1] = Character.toUpperCase(arr[n - 1]);

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "Hello bro kyse ho!";
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = Capitalize(words[i]);
        }

        String s2 = String.join(" ", words);

        System.out.println(s2);

        // next task capitalize first letter from each word

    }
}

package school.redrover;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4_splitPairs {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "abcdef";
        String str3 = "abcdefg";

        System.out.println("\n-------Yuliya-------");
        System.out.println(Arrays.toString(splitPairsYuliya(str)));
        System.out.println(Arrays.toString(splitPairsYuliya(str2)));
        System.out.println(Arrays.toString(splitPairsYuliya(str3)));

         System.out.println("-------Tatiana-------");
        System.out.println(Arrays.toString(splitPairsTatiana(str)));
        System.out.println(Arrays.toString(splitPairsTatiana(str2)));
        System.out.println(Arrays.toString(splitPairsTatiana(str3)));


    }

    public static String[] splitPairsYuliya(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }
        String[] result = new String[s.length() / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = "" + s.charAt(i + i) + s.charAt(i + i + 1);
        }
        return result;
    }

    public static String[] splitPairsTatiana(String s) {
        List<String> result = new ArrayList<>();

        if (s.length() % 2 != 0) {
            s = s + '_';
        }
        for (int i = 0; i < s.length(); i += 2) {
            result.add(s.substring(i, i + 2));
        }
        return result.toArray(new String[0]);
    }
}
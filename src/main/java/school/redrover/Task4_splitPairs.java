package school.redrover;

import java.util.Arrays;

public class Task4_splitPairs {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "abcdef";
        String str3 = "abcdefg";

        System.out.println("\n-------Yuliya-------");
        System.out.println(Arrays.toString(splitPairsYuliya(str)));
        System.out.println(Arrays.toString(splitPairsYuliya(str2)));
        System.out.println(Arrays.toString(splitPairsYuliya(str3)));
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
}
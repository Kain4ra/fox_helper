package school.redrover;
//https://www.codewars.com/kata/545cedaa9943f7fe7b000048

import java.util.HashSet;
import java.util.Set;

public class Task1_Panagram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String str2 = "The quick Yellow fox jumps over the lazy COW";


        System.out.println("Zina's: " + checkZina(str));
        System.out.println("Zina's: " + checkZina(str2));

    }

    public static boolean checkKain4ra(String sentence) {
        Set<Character> listCharacters = new HashSet<>();
        for (Character symbol : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(symbol)) listCharacters.add(symbol);
        }
        return listCharacters.size() == 26;
    }


    public static boolean checkZina(String expression) {
        StringBuilder sb = new StringBuilder();
        boolean result = false;
        for (char e : expression.toCharArray()) {
            if (Character.isLetter(e)) {
                e = Character.toLowerCase(e);
                if (sb.indexOf(String.valueOf(e)) == -1) {
                    sb.append(e);
                }
                if (sb.length() == 26) {
                    result = true;
                }
            }
        }
        return result;
    }

    public static boolean checkTina(String sentence){
        String s = "abcdefghijklmnopqrstuvwxyz";
        String str = "";
        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.toLowerCase().toCharArray()[i];
            if ((s.indexOf(c) != -1) && (str.indexOf(c) == -1)) {
                str += Character.toLowerCase(c);
            }
        }
        return str.length() == 26;
    }
}

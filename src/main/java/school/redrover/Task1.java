package school.redrover;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String str2 = "The quick Yellow fox jumps over the lazy COW";
        System.out.println("Zina's: " + checkZina(str));
        System.out.println("Zina's: " + checkZina(str2));
        System.out.println("Zina's: " + checkZina("1255"));
    }

    public static boolean checkKain4ra(String sentence) {
        Set<Character> listCharacters = new HashSet();
        char[] var2 = sentence.toLowerCase().toCharArray();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Character symbol = var2[var4];
            if (Character.isLetter(symbol)) {
                listCharacters.add(symbol);
            }
        }

        return listCharacters.size() == 26;
    }

    public static boolean checkZina(String expression) {
        StringBuilder sb = new StringBuilder();
        boolean result = false;

        for(char e : expression.toCharArray()) {
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
}

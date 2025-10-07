package school.redrover;
//https://www.codewars.com/kata/545cedaa9943f7fe7b000048

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
    }

    public static boolean checkKain4ra(String sentence) {
        Set<Character> listCharacters = new HashSet<>();
        for (Character symbol : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(symbol)) listCharacters.add(symbol);
        }
        return listCharacters.size() == 26;
    }
}

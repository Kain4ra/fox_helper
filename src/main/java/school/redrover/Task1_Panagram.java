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

        System.out.println("Yuliya's: " + checkYuliya(str));
        System.out.println("Yuliya's: " + checkYuliya(str2));
        System.out.println("----------Tatiana----------");
        System.out.println(checkTatiana("Hello world!"));
        System.out.println(checkTatiana("The quick brown fox jumps over the lazy dogHello world!"));
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

    public static boolean checkTina(String sentence) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        String str = "";
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.toLowerCase().toCharArray()[i];
            if ((s.indexOf(c) != -1) && (str.indexOf(c) == -1)) {
                str += Character.toLowerCase(c);
            }
        }
        return str.length() == 26;
    }

    public static boolean checkYuliya(String sentence) {
        HashSet<Character> alphabet = new HashSet<>();
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }
        System.out.println("Alphabet: " + alphabet);

        String updated = sentence.toLowerCase().replaceAll("[\\d\\p{Punct} ]+", "");
        char[] initialSentence = updated.toCharArray();
        HashSet<Character> sentenceChar = new HashSet<>();

        for (char c : initialSentence) {
            sentenceChar.add(c);
        }
        System.out.println("Sentence: " + sentenceChar);

        return sentenceChar.containsAll(alphabet);
    }
  
    public static boolean checkTatiana(String sentence) {
        if (sentence == null) return false;

        sentence = sentence.toLowerCase();

        Set<Character> letters = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }
        return letters.size() == 26;
    }

}

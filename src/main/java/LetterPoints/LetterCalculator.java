package LetterPoints;

import java.util.Locale;
import java.util.Map;

public class LetterCalculator {

    public static final Map<Character,Integer> letterPoints = Map.ofEntries(Map.entry('A',1),Map.entry('R',1),
            Map.entry('T',1),Map.entry('H',1),Map.entry('I',1),Map.entry('K',1),
            Map.entry('P',3),Map.entry('Q',3),Map.entry('S',3)
            ,Map.entry('Z',3),Map.entry('U',3),Map.entry('V',3),Map.entry('W',3));

    private static int wordScoreCalculator(String letterscase) {
        String letters=letterscase.toUpperCase();
        int points=0;

        for(Character letter : letters.toCharArray()){
            for(Map.Entry entry :letterPoints.entrySet()) {
                if (letter.equals(entry.getKey())) {
                    points = points + (int) entry.getValue();

                }
            }
        }
        return  points;
    }
    public static void main(String[] args) {

        System.out.println(wordScoreCalculator("Karthik"));
    }


}

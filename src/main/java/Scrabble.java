import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    private String word;
    private Map<Character, Integer> letterValues = new HashMap<>();

    public Scrabble(String word) {
        this.word = word;
        letterValuesMap();
    }

    public static void main(String[] args) {
        //Not needed??
    }

    private void letterValuesMap(){

        letterValues.put('a', 1);
        letterValues.put('b', 3);
        letterValues.put('c', 3);
        letterValues.put('d', 2);
        letterValues.put('e', 1);
        letterValues.put('f', 4);
        letterValues.put('g', 2);
        letterValues.put('h', 4);
        letterValues.put('i', 1);
        letterValues.put('j', 8);
        letterValues.put('k', 5);
        letterValues.put('l', 1);
        letterValues.put('m', 3);
        letterValues.put('n', 1);
        letterValues.put('o', 1);
        letterValues.put('p', 3);
        letterValues.put('q', 10);
        letterValues.put('r', 1);
        letterValues.put('s', 1);
        letterValues.put('t', 1);
        letterValues.put('u', 1);
        letterValues.put('v', 4);
        letterValues.put('w', 4);
        letterValues.put('x', 8);
        letterValues.put('y', 4);
        letterValues.put('z', 10);
    }

    public int score() {
        if (word == null || word.equals("")) {
            return 0;
        } else {
            word = word.toLowerCase();
            int result = 0;
            for (char letter : word.toCharArray()) {
                result += letterValues.get(letter);
            }
            return result;
        }
    }

}

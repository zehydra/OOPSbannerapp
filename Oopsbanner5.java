
    import java.util.HashMap;
import java.util.Map;

/**
 * BannerGenerator demonstrates use of HashMap for storing
 * and retrieving character banner patterns.
 * 
 * Concepts: HashMap, Encapsulation, Modularity, StringBuilder,
 * Static Methods, Nested Loops
 */
public class Oopsbanner5 {
    /**
     * BannerCharacter class stores character and its ASCII pattern
     */
    static class BannerCharacter {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor
         * @param character letter
         * @param pattern 7-line ASCII pattern
         */
        public BannerCharacter(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }

        /**
         * Getter for character
         * @return stored character
         */
        public char getCharacter() {
            return character;
        }
    }

    /**
     * Builds and returns map of characters and their patterns
     * @return HashMap<Character, BannerCharacter>
     */
    public static Map<Character, BannerCharacter> buildPatternMap() {

        Map<Character, BannerCharacter> map = new HashMap<>();

        // O Pattern
        map.put('O', new BannerCharacter('O', new String[]{
                " ***** ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                " ***** "
        }));

        // P Pattern
        map.put('P', new BannerCharacter('P', new String[]{
                "*****  ",
                "**   **",
                "**   **",
                "*****  ",
                "**     ",
                "**     ",
                "**     "
        }));

        // S Pattern
        map.put('S', new BannerCharacter('S', new String[]{
                " ***** ",
                "**   **",
                "**     ",
                " ***** ",
                "     **",
                "**   **",
                " ***** "
        }));

        return map;
    }

    /**
     * Prints banner message
     * @param message word to print
     * @param map character pattern map
     */
    public static void printBanner(String message, Map<Character, BannerCharacter> map) {

        int height = 7;

        // Outer loop → each row
        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            // Inner loop → each letter
            for (char ch : message.toCharArray()) {

                BannerCharacter bc = map.get(ch);

                if (bc != null) {
                    line.append(bc.getPattern()[row]).append("  ");
                } else {
                    line.append("??????  ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        Map<Character, BannerCharacter> patternMap = buildPatternMap();

        String word = "OOPS";

        printBanner(word, patternMap);
    }
}

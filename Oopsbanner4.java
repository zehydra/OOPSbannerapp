public class Oopsbanner4{
    public static class CharacterPatternMap {

        /** Character value */
        private final char character;

        /** 7-line banner pattern */
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * @param character the character represented
         * @param pattern 7-line banner pattern of character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns character stored
         * @return character value
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns pattern of character
         * @return 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Returns CharacterPatternMap object for requested character
     * @param ch character to search
     * @param patterns array of pattern objects
     * @return matching CharacterPatternMap or null if not found
     */
    public static CharacterPatternMap getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap obj : patterns) {
            if (obj.getCharacter() == ch) {
                return obj;
            }
        }
        return null;
    }

    /**
     * Main method — builds and prints OOPS banner
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Pattern for O
        String[] O = {
                " ***** ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                " ***** "
        };

        // Pattern for P
        String[] P = {
                "*****  ",
                "**   **",
                "**   **",
                "*****  ",
                "**     ",
                "**     ",
                "**     "
        };

        // Pattern for S
        String[] S = {
                " ***** ",
                "**   **",
                "**     ",
                " ***** ",
                "     **",
                "**   **",
                " ***** "
        };

        // Array of objects
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        String word = "OOPS";

        // Print banner line by line
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPatternMap cp = getCharacterPattern(ch, patterns);

                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}
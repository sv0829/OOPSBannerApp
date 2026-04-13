import java.util.*;

public class BannerApp {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    // Map to store patterns
    private static Map<Character, CharacterPattern> patternMap = new HashMap<>();

    // Initialize patterns
    static {
        patternMap.put('O', new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));
    }

    public static void main(String[] args) {
        String word = "OOPS";

        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(ch);
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}
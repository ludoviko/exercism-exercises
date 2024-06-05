import java.util.HashMap;
import java.util.Map;

class SqueakyClean {

    private static final String UNDER_SCORE = "_";
    private static final String HYPHEN = "-";
    private static final String NOT_LETTERS = "[^0-9a-zA-Z_-]";

    private static final Map<Character, Character> MAP_CONVERTER = new HashMap<>();
    static {
        MAP_CONVERTER.putIfAbsent('4', 'a');
        MAP_CONVERTER.putIfAbsent('3', 'e');
        MAP_CONVERTER.putIfAbsent('0', 'o');
        MAP_CONVERTER.putIfAbsent('1', 'l');
        MAP_CONVERTER.putIfAbsent('7', 't');
    }

    static String clean(String identifier) {
        identifier = identifier.replaceAll(" ",UNDER_SCORE);

        identifier = identifier.replaceAll(NOT_LETTERS, "");

        if (identifier.contains(HYPHEN)) {
            identifier = toCamelCase(identifier);
        }

        identifier = encodeDigits(identifier);

        return identifier;
    }

    private static String toCamelCase(String identifier) {
        char[] data = identifier.toCharArray();
        StringBuilder builder = new StringBuilder();

        int i  = 0;

        while (i < data.length) {
            if (data[i] == HYPHEN.charAt(0)) {
                i++;
                builder.append(Character.toUpperCase(data[i]));
            } else {
                builder.append(data[i]);
            }

            i++;
        }

        return builder.toString();
    }

    private static String encodeDigits(String identifier) {
        char[] data = identifier.toCharArray();
        StringBuilder builder = new StringBuilder();

        int i  = 0;

        while (i < data.length) {
            if (MAP_CONVERTER.containsKey(data[i])) {
                builder.append(MAP_CONVERTER.get(data[i]));
            } else {
                builder.append(data[i]);
            }

            i++;
        }

        return builder.toString();
    }

}

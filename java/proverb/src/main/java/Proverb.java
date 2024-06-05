class Proverb {

    private final String[] words;
    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        String line = "For want of a %s the %s was lost.\n";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length - 1; i++) {
            builder.append(String.format(line, words[i], words[i + 1]));
        }

        if (words.length > 0) {
            builder.append(String.format("And all for the want of a %s.", words[0]));
        }

        return builder.toString();
    }
}

import java.util.ArrayList;
import java.util.List;

class LargestSeriesProductCalculator {

    private final String string;

    private static final String REGEX = "\\d*";

    public LargestSeriesProductCalculator(String inputNumber) {
        if (!inputNumber.matches(REGEX)) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }

        this.string = inputNumber;
    }

    public long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits > this.string.length()) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }

        List<String> data = slices(numberOfDigits);

        long max = 0;

        for (String n : data) {
            long value = evaluate(n);
            if (value >= max) {
                max = value;
            }
        }

        return max;
    }

    private List<String> slices(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        } else if (num > string.length()) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }

        List<String> data = new ArrayList<>();

        int m = string.length() - (num - 1);

        for (int i = 0; i < m; i++) {
            data.add(string.substring(i, i + num));
        }

        return data;
    }

    private long evaluate(String n) {

        if ("0".equals(n)) {
            return 0;
        }

        long product = 1;

        int digit = -1;
        for (int i = 0; i < n.length(); i++) {
            digit = Integer.parseInt(n.substring(i, i+1));

            product *= digit;
        }

        return product;
    }
}

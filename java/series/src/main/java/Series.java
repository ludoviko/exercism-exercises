import java.util.ArrayList;
import java.util.List;

class Series {
    private final String string;

    Series(String string) {
        if (string.isEmpty()) {
            throw new IllegalArgumentException("series cannot be empty");
        }

        this.string = string;
    }

    List<String> slices(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("slice length cannot be negative or zero");
        } else if (num > string.length()) {
            throw new IllegalArgumentException("slice length cannot be greater than series length");
        }

        List<String> data = new ArrayList<>();

        int m = string.length() - (num - 1);

        for (int i = 0; i < m; i++) {
            data.add(string.substring(i, i + num));
        }

        return data;
    }
}

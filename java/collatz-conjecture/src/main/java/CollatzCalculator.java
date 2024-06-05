class CollatzCalculator {
    public int computeStepCount(int start) {
        int count = 0;

        if (start < 1) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }

        while (start > 1) {
            if (start % 2 == 0) {
                start /= 2;
            } else {
                start = start * 3 +1;
            }
            count++;
        }

        return count;
    }
}


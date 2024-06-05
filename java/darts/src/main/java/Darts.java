class Darts {
    public final int INNER_DISTANCE = 1;
    public final int MIDDLE_DISTANCE = 5;
    public final int OUTER_DISTANCE = 10;
    int score(double xOfDart, double yOfDart) {
        double distance = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);

        if (distance <= INNER_DISTANCE) {
            return 10;
        } else if (distance <= MIDDLE_DISTANCE) {
            return 5;
        } else if (distance <= OUTER_DISTANCE) {
            return 1;
        } else {
            return 0;
        }
    }
}



public class SquareRoot {
    public int squareRoot(int radicand) {
       return heronMethod(radicand);
    }

    private int heronMethod(int radicand) {
        int iterations = 20;

        double solution = 1;

        for (int i = 0; i < iterations; i++) {
            solution = (solution +  radicand / solution) * 0.5;
        }

        return (int) solution;
    }
}

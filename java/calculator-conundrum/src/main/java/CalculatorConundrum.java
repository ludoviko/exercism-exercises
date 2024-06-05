class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        int solution = 0;

        switch (operation) {
            case "+" :
                solution = operand1 + operand2;
                return String.format("%d %s %d = %d", operand1, operation, operand2, solution);
            case "*":
                solution = operand1 * operand2;
                return String.format("%d %s %d = %d", operand1, operation, operand2, solution);
            case "/" :
                try {
                    solution = operand1 / operand2;
                } catch (ArithmeticException exc) {
                    throw new IllegalOperationException("Division by zero is not allowed", exc);
                }

                return String.format("%d %s %d = %d", operand1, operation, operand2, solution);
            case "" :
                throw new IllegalArgumentException("Operation cannot be empty");
            case null :
                throw new IllegalArgumentException("Operation cannot be null");
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }
}


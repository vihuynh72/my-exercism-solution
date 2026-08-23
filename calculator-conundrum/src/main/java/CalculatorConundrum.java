class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {
        switch (operation) {
            case "+":
                return operand1 + " + " + operand2 + " = " + String.valueOf(operand1 + operand2);
            case "*":
                return operand1 + " * " + operand2 + " = " + String.valueOf(operand1 * operand2);
            case "/":
                try {
                    return operand1 + " / " + operand2 + " = " + String.valueOf(operand1 / operand2);
                } catch (ArithmeticException cause) {
                    throw new IllegalOperationException("Division by zero is not allowed", cause);
                }
            case null:
                throw new IllegalArgumentException("Operation cannot be null");
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            case "-":
                throw new IllegalOperationException("Operation '-' does not exist");
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }
}

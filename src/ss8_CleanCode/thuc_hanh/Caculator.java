package ss8_CleanCode.thuc_hanh;

public class Caculator {
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';


    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                return extracted(firstOperand, secondOperand);
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }




    private static int extracted(int firstOperand, int secondOperand) {
        if (secondOperand != 0)
            return firstOperand / secondOperand;
        else
            throw new RuntimeException("Can not divide by 0");
    }
}



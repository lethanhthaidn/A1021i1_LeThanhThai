package ss8_CleanCode.thuc_hanh;

public class CaculatorTest {
    public static void main(String[] args) {
        int firstOperand = 1;
        int secondOperand = 2;
        char operator = '+';
        int result = Caculator.calculate(firstOperand,secondOperand,operator);
        System.out.println(result);
    }
}


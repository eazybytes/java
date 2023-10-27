public class ArithmeticOperations {

    double piValue = 3.14;
    static final double PI_VALUE = 3.14;

    public static void main(String[] args) {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        int result = arithmeticOperations.sum(20, 5);
        System.out.println(result);
    }

    public int sum(int num1, int num2) {
        subtract(num1, num2);
        addition(num1, num2);
        int result = num1 + num2;
        return result;
    }

    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

}

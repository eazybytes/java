public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello Madan");
    }


    /**
     * Adds two numbers
     * @param a the first number
     * @param b the second number
     * @return the sum of the two numbers
     */
    public static int add(int a, int b) {
        System.out.println("Sum: " + (a+b));
        return a + b;
    }

    /**
     * Subtracts two numbers
     * @param a the first number
     * @param b the second number
     * @return the difference of the two numbers
     */
    public static int subtract(int a, int b) {
        System.out.println("Difference: " + (a-b));
        return a - b;
    }

    /**
     * Multiplies two numbers
     * @param a the first number
     * @param b the second number
     * @return the product of the two numbers
     */
    public static int multiply(int a, int b) {
        System.out.println("Product: " + (a*b));
        return a * b;
    }

    /**
     * Divides two numbers
     * @param a the first number
     * @param b the second number
     * @return the quotient of the two numbers
     */
    public static double divide(int a, int b) {
        System.out.println("Quotient: " + (a/b));
        return (double)a / b;
    }


}

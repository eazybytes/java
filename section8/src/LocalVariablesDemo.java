public class LocalVariablesDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {  // i declared as a local variable
            int x = i * 2; // x is a local variable
            System.out.println("i = " + i + ", x = " + x);
        }

        int number = 10;
        if (number > 0) {
            int square = number * number;
            System.out.println("The square of " + number + " is " + square);
        } else {
            int absoluteValue = -1 * number;
            System.out.println("The absolute value of " + number + " is " + absoluteValue);
        }

    }

    public void myMethod() {
        int x = 10;
        System.out.println(x);

        int number = 2;

        switch (number) {
            case 1:
                System.out.println("Odd number");
                 // System.out.println(i); // Compilation error as i is never declared
                break;
            case 2:
                int i = number; // local variable i declared first time
                System.out.println(i);
                System.out.println("Even number");
                break;
            default:
                i = 10; // local variable i can be accessed as it is declared in the top
                System.out.println(i);
                System.out.println("Invalid number");
                break;
        }

        // System.out.println(i);

    }

}

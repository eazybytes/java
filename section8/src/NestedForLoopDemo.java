public class NestedForLoopDemo {

    public static void main(String[] args) {

        int number = 10;

        for(int i = 1; i <= number; i++) {
            for(int j =1; j<=number;j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }

        int rows = 10;
        for (int i =1; i <=rows; i ++ ) {
            for (int j =1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

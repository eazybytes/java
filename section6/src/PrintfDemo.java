public class PrintfDemo {

    public static void main(String[] args) {
        /*String result = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println(result);*/

        System.out.printf("Name: %s, Age: %d%n", "John", 25);
        System.out.printf("Price: %.2f%n", 19.99);
        System.out.printf("Grade: %c%n", 'A');
        System.out.printf("Is Java fun ?: %b%n", true);

        System.out.print("Sample String value");
        System.out.print("Another String value");

        System.out.println("Sample String value");
        System.out.println("Another String value");
    }

}

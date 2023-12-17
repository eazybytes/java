public class SwitchExpressionDemo {

    public static void main(String[] args) {
        String fruitName = "Banana";
        switch (fruitName) {
            case "Banana", "Apple" -> System.out.println("$ 1.0 charged");
            case "Grapes" -> System.out.println("$ 2.0 charged");
            case "Pineapple" -> System.out.println("$ 2.5 charged");
            case "Mango" -> System.out.println("$ 3.0 charged");
            default -> System.out.println("Pick a valid fruit");
        }

        String output = switch (fruitName) {
            case "Banana", "Apple" -> "$ 1.0 charged";
            case "Grapes" -> "$ 2.0 charged";
            case "Pineapple" -> "$ 2.5 charged";
            case "Mango" -> "$ 3.0 charged";
            default -> "Pick a valid fruit";
        };

    String day = "FRIDAY";

        int numLetters = switch (day) {

            case "MONDAY", "FRIDAY", "SUNDAY" -> {
                System.out.println(6);
                yield 6;
            }
            case "TUESDAY" -> {
                System.out.println(7);
                yield 7;
            }
            case "THURSDAY", "SATURDAY" -> {
                System.out.println(8);
                yield 8;
            }
            case "WEDNESDAY" -> {
                System.out.println(9);
                yield 9;
            }
            default -> {
                System.out.println("Invalid Day");
                yield 0;
            }

        };

    }

}

public class StringFormatDemo {

    public static void main(String[] args) {
        String message = "Hello, %s ! You have %d messages.";
        String msgForMadan = String.format(message, "Madan", 3);
        String msgForSaanvi = String.format(message, "Saanvi", 6);

        String message1 = "The price is $%.2f";
        String price1 = String.format(message1, 19.99);
        String price2 = String.format(message1, 9.99);

        String message2 = "The number is %5d";
        String number1 = String.format(message2, 5);
        String number2 = String.format(message2, 15);

        String message3 = "My name is %3$s, I am %2$d years old, and I live in %1$s.";
        String result = String.format(message3, "NewYork", 25, "Nitin");

    }

}

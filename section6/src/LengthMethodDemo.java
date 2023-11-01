public class LengthMethodDemo {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String combined = str1+ " "+str2;

        int length1 = str1.length();
        int length2 = str2.length();
        int length3 = combined.length();

        int emptyLength = "".length();
        int length4 = "Hello".length();
    }
}

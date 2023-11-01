public class ConvertStringDemo {

    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14;
        boolean boolValue = true;

        String str1 = String.valueOf(intValue);
        String str2 = String.valueOf(doubleValue);
        String str3 = String.valueOf(boolValue);
        String str4 = String.valueOf('M');

        int age = 30;
        String message = "My age is : "+ age;
        String piValue = ""+ 3.14;
    }
}

public class ParsingDemo {

    public static void main(String[] args) {
        String strInt = "456";
        int num = Integer.parseInt(strInt);
        String strDouble = "3.14";
        double num1 = Double.parseDouble(strDouble);
        String strFloat = "2.718";
        float num2 = Float.parseFloat(strFloat);
        String strLong = "3476543210";
        long num3 = Long.parseLong(strLong);
        String strBoolean = "true";
        boolean isTrue = Boolean.parseBoolean(strBoolean);
        String strName = "madan";
        boolean isName = Boolean.parseBoolean(strName);
        String hello = "Hello";
        char firstChar = hello.charAt(0);
        char[] charArray = hello.toCharArray();
        char secondChar = charArray[1];
    }

}

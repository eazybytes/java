public class StringConcatenationDemo {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        String str1 = " goals";
        String output = num1 + num2 + str1;

        output = num1 + (num2 + str1);
        output = num1 + "" + num2 + str1;

        boolean b = false;
        output = b + (num1 + num2 + str1);
        output = "" + b + num1 + num2 + str1;

        String str2 = null;
        String str3 = 6 + str2;
        String str4 = "goals" + str2;
        String str5 = "6" + null;


    }

}

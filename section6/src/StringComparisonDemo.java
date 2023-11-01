public class StringComparisonDemo {

    public static void main(String[] args) {

        String str1 = new String("Hey");
        String str2 = new String("Hello");
        String str3 = new String("Hey");

        boolean b1 = str1.equals(str2);
        boolean b2 = str1.equals(str3);

        boolean b3 = str1.equals("Hey");
        boolean b4 = "Hey".equals(str1);
        boolean b5 = "Hey".equals("Hello");

        String str4 ="java";
        String str5 ="JAVA";
        boolean b6 = str4.equalsIgnoreCase(str5);

        int comparison1 = "java".compareTo("java");
        int comparison2 = "java".compareTo("python");
        int comparison3 = "python".compareTo("java");

    }

}

public class NullDemo {

    public static void main(String[] args) {
        String myString = null;
        Employee employeeObject = null;
        int age = employeeObject.getAge();
        System.gc();
    }

}

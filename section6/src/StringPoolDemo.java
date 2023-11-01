public class StringPoolDemo {

    public static void main(String[] args) {
        String hello = "hello";
        String hi = "hello";
        String hey = "hey";
        System.out.println(hello == hi);
        System.out.println(hello.hashCode());
        System.out.println(hi.hashCode());
        System.out.println(hey.hashCode());

        String obj = new String("hello");
        String obj1 = new String("hello");
        String obj2 = new String("hey");
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj == obj1);

    }
}

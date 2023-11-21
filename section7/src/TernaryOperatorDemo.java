public class TernaryOperatorDemo {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int max = (x > y ) ? x : y; // 20
        System.out.println(max);

        boolean isEven = ((11%2)==0) ? true : false;
        System.out.println(isEven);
    }

}

public class TernaryOperator {

    public static void main(String[] args) {
        int x = 10 , y;
        /*if(x>5){
            y = 20;
        }else {
            y = 30;
        }*/
        y = x > 5 ? 20 : 30;
        System.out.println(y);
        sum(x, x > 5 ? 20 : 30 );
    }

    public static void sum (int x, int y) {
        System.out.println(x+y);
    }

}

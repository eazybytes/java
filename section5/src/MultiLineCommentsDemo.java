public class MultiLineCommentsDemo {

    /*
        Based on business requirements, the end user is
        allowed to retry a maximum of 3 login attempts.
        Using the below constant, the same is going to be
        controlled. If the requirement changes, then change
        the below value
     */
    static final int MAX_RETRY_ATTEMPTS = 3;

    public static void main(String[] args) {
        MultiLineCommentsDemo obj = new MultiLineCommentsDemo();
        double totalArea = obj.calculateRectangleArea(24.5, 34.6);
        System.out.println(totalArea);
    }

    /*
    This method calculates the area of the rectangle based
     on given length and width. The logic it is going to have
     is multiply two given input method arguments and return
     the same to the caller
     */
     public double calculateRectangleArea (double length, double width) {
        return length*width;
    }

}

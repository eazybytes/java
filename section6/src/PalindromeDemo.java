/**
 * Class helps to identify a given String is
 * a palindrome or not.
 *
 * <p>
 * Examples of palindromes are,
 * <ul>
 *     <li>madam</li>
 *     <li>racecar</li>
 *     <li>mom</li>
 *     <li>noon</li>
 *     <li>wow</li>
 * </ul>
 * </p>
 *
 */
public class PalindromeDemo {
    public static void main(String[] args) {
        String input = "mom";
        StringBuffer stringBuffer = new StringBuffer(input);
        boolean isPalindrome = input.equals(stringBuffer.reverse().toString());
        System.out.printf("Is the given String %s is a palindrome or not ? : %b%n", input, isPalindrome);
        String textBlock = """
                """;
    }
}

/* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is

9009 = 91 * 99

Find the largest palindrome made from the product of two 3-digit numbers. */

public class LargestPalindromeProduct extends BaseProblem implements BaseProblemIfc {
    LargestPalindromeProduct() {
        super(4);
    }

    @Override
    public String solve() {
        int product;
        int maxPalindrome = 0;
        int factor1 = 0;
        int factor2 = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                product = i * j;

                if (isPalindrome(product) && product > maxPalindrome) {
                    maxPalindrome = product;
                    factor1 = i;
                    factor2 = j;
                }
            }
        }

        //System.out.println(factor1 + " x " + factor2 + " = " + maxPalindrome);

        return String.valueOf(maxPalindrome);
    }

    public Boolean isPalindrome(int number) {
        String str;

        str = String.valueOf(number);

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
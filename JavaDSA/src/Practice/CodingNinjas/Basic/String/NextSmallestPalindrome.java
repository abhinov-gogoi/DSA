package Practice.CodingNinjas.Basic.String;

/**
 * https://www.codingninjas.com/studio/problems/given-a-string-find-the-next-smallest-palindrome_874577
 * https://leetcode.com/problems/find-the-closest-palindrome/
 * https://www.geeksforgeeks.org/given-a-number-find-next-smallest-palindrome-larger-than-this-number/
 * https://www.interviewbit.com/problems/next-smallest-palindrome/
 *
 */
public class NextSmallestPalindrome {


    public static final String STR_1 = "2";
    public static final String STR_2 = "999";
    public static final String STR_3 = "12321";
    public static final String STR_4 = "23545";

    public static void main(String[] args) {
        System.out.println(nextPalindrome(STR_3, 0));
    }

    public static String nextPalindrome(String string, int length) {

        // check if given string is actually a number
        int number = Integer.MIN_VALUE;
        try {
            number = Integer.parseInt(string);
        } catch (NumberFormatException nfe) {
            System.out.println("Not a Number");
            System.exit(0);
        }

        // there can be 4 cases -
        if (string.length() == 1) {
            // if number is single digit
            number = number + 1;
        } else if (stringContainsOnlyNines(string)) {
            number = number + 2;
        } else if (stringIsPalindrome(string)) {
            number = incrementMidPoint(string);
        } else {

        }

        return String.valueOf(number);
    }

    /**
     * This method increments mid-point(s) of a number
     * 1221 -> 1331
     * 12321 -> 12421
     */
    private static int incrementMidPoint(String string) {
        if(stringIsEvenLength(string)) {

        } else {

        }
        return 0;
    }

    private static boolean stringIsEvenLength(String string) {
        return string.length() % 2 == 0;
    }

    private static boolean stringContainsOnlyNines(String string) {
        for(int i=0; i<string.length(); i++) {
            if(string.charAt(i) != '9') {
                return false;
            }
        }
        return true;
    }

    private static boolean stringIsPalindrome(String string) {
        for(int i=0; i<string.length()/2; i++) {
            char leftChar = string.charAt(i);
            char rightChar = string.charAt(string.length()-1-i);
            if(leftChar != rightChar) {
                return false;
            }
        }
        return true;
    }
}

package Practice.CodingNinjas.Basic.String;

import java.util.Scanner;


/**
 * https://leetcode.com/problems/reverse-words-in-a-string/
 * https://www.codingninjas.com/studio/problems/reverse-string-word-wise_1262348
 */
class ReverseStringWordWise {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }

    static String reverseStringWordWise(String input) {
        StringBuilder reversedString = new StringBuilder();
        String[] tokens = input.split(" ");
        for (int i = tokens.length - 1; i >= 0; i--) {
            String word = tokens[i].trim();
            if (!word.isEmpty()) {
                reversedString.append(word).append(" ");
            }
        }
        return reversedString.toString().trim();
    }

}


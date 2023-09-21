package Practice.CodingNinjas.Basic.String;

import java.util.Stack;

/**
 * https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 * https://www.codingninjas.com/studio/problems/mnfrj_1075018
 */
public class MinimumParentheses {

    public static final String STR_1 = "(()()()(";

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid(STR_1));
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character bracket = s.charAt(i);

            // if opening bracket, always push into stack
            if (bracket.equals('(')) {
                stack.push(bracket);
            } else {
                // if stack is empty push ) into stack
                if (stack.isEmpty()) {
                    stack.push(bracket);
                } else {
                    // check the previous bracket
                    Character previousBracketInStack = stack.peek();
                    if (previousBracketInStack.equals(')')) {
                        // push another ) one into stack
                        stack.push(')');
                    } else {
                        // previous bracket is ( , So, instead of inserting )
                        // we have to pop the previous bracket as it forms a valid pair
                        stack.pop();
                    }
                }
            }
        }
        return stack.size();
    }


}

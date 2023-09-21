package Practice.CodingNinjas.Basic.String;

/**
 * Run Length Encoding
 * https://www.codingninjas.com/studio/problems/encode-the-message_699836
 */
public class StringEncoding {

    public static final String STR_1 = "abbcccddddeeeeefffffgggp";

    public static void main(String[] args) {
        System.out.println(encode(STR_1));
    }

    public static String encode(String message) {
        StringBuilder encodedString = new StringBuilder();

        Character charUnderInspection = message.charAt(0);
        int countOfCharUnderInspection = 0;

        for (int i = 0; i < message.length(); i++) {
            Character currentChar = message.charAt(i);
            if (charUnderInspection.equals(currentChar)) {
                // increment count
                countOfCharUnderInspection++;
            } else {
                encodedString.append(charUnderInspection).append(countOfCharUnderInspection);
                // reset values
                charUnderInspection = currentChar;
                countOfCharUnderInspection = 1;
            }

            if (i == message.length() - 1) {
                encodedString.append(charUnderInspection).append(countOfCharUnderInspection);
            }
        }
        return encodedString.toString();
    }

}

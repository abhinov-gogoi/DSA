package Practice.CodingNinjas.Basic.String;

/**
 * https://www.codingninjas.com/studio/problems/beautiful-string_1115625
 * https://www.youtube.com/watch?v=P1hgy238oPU
 */
public class BeautifulString {

    public static final String STR_1 = "0000";
    public static final String STR_2 = "1010";
    public static final String STR_3 = "1001010";

    public static void main(String[] args) {
        System.out.println(makeBeautiful(STR_3));
        System.out.println(makeBeautiful(STR_2));
        System.out.println(makeBeautiful(STR_1));
    }

    public static int makeBeautiful(String str) {
        String beautifulStringStartingWithZero = generateBeautifulString(str.length(), 0);
        String beautifulStringStartingWithOne = generateBeautifulString(str.length(), 1);
//        System.out.println(beautifulStringStartingWithZero);
//        System.out.println(beautifulStringStartingWithOne);

        int bitNeedsChange_ZERO_BASED = 0;
        int bitNeedsChange_ONE_BASED = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == beautifulStringStartingWithZero.charAt(i)) {
                // bit needs to change here
                bitNeedsChange_ZERO_BASED++;
            } else if (str.charAt(i) == beautifulStringStartingWithOne.charAt(i)) {
                // bit needs to change
                bitNeedsChange_ONE_BASED++;
            }
        }

        return Math.min(bitNeedsChange_ONE_BASED, bitNeedsChange_ZERO_BASED);
    }

    public static String generateBeautifulString(int length, int startsWith) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(startsWith));
        for (int i = 1; i < length; i++) {
            if (stringBuilder.charAt(i - 1) == '0') {
                stringBuilder.append("1");
            } else {
                stringBuilder.append("0");
            }
        }
        return stringBuilder.toString();
    }
}

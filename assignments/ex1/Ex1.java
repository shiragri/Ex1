package assignments.ex1;
/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {
        /**
         * Convert the given number (num) to a decimal representation (as int).
         * It the given number is not in a valid format returns -1.
         * @param num a String representing a number in basis [2,16]
         * @return the given number as Decimal
         */
        public static int number2Int(String num) {
            int val = -1;

            int baseint=10;
            String numToCheck=num;
            int len = numToCheck.length();
            if (len>2){
                char charB = num.charAt(len-2);
                if (charB == 'b') {
                    char base = num.charAt(len-1);
                    numToCheck = num.substring( 0, len-2);
                    baseint= baseToInt(base);
    }
            }
            try {
                val = Integer.parseInt(numToCheck, baseint);
            }
            catch (NumberFormatException e) {
                val = -1;
            }


            return val;
        }
        /**
         * This static function checks if the given String (g) is in a valid "number" format.
         * @param a a String representing a number
         * @return true iff the given String is in a number format
         */
        public static boolean isNumber(String a) {
            boolean ans = true;

            int baseint=10;
            String numToCheck=a;
            int len = numToCheck.length();
            if (len >2){
                char charB = a.charAt(len-2);
                if (charB == 'b') {
                    char base = a.charAt(len - 1);
                    numToCheck = a.substring(0, len - 2);
                    baseint = baseToInt(base);
                }
            }

            String numToCheck1 = numToCheck.toUpperCase();
            if (!numToCheck1.equals(numToCheck)) {
                return false;
            }
            try {
                int val = Integer.parseInt(numToCheck, baseint);
            }
            catch (NumberFormatException e) {
                ans = false;
            }
            return ans;
        }

    /**
     * get char representing base for 2  to g
     * @param c base as char
     * @return int the base as decimal
     */
    public static int baseToInt (char c) {
            if (c>= '2' && c<= '9')
                return c-'0';
            else if (c >= 'A' && c<= 'G')
                return c-'A'+10;
            return -1;

        }

    /**
     * get char representing base for 2  to g
     * @param i base as char
     * @return the char value of the given decimal
     */
    public static char intToBase (int i) {
        if (i >= 2 && i <= 9)
            return (char)(i+'0');
        else if (i >= 10 && i <= 16)
            return (char) (i+55);

        return '-';

    }
        /**
         * Calculate the number representation (in basis base)
         * of the given natural number (represented as an integer).
         * If num<0 or base is not in [2,16] the function should return "" (the empty String).
         * @param num the natural number (include 0).
         * @param base the basis [2,16]
         * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
         */
        public static String int2Number(int num, int base) {
            String ans = Integer.toString(num, base);
            if(base==10) {
                return ans;
            }
            else {
                char baseChar = intToBase(base);
                ans = ans + "b" + baseChar;
                return ans;
            }
        }

        /**
         * Checks if the two numbers have the same value.
         * @param n1 first number
         * @param n2 second number
         * @return true iff the two numbers have the same values.
         */
        public static boolean equals(String n1, String n2) {
            boolean ans = true;
            int n1Int = number2Int(n1);
            int n2Int = number2Int(n2);
            return (n1Int == n2Int);
        }

        /**
         * This static function search for the array index with the largest number (in value).
         * In case there are more than one maximum - returns the first index.
         * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
         * @param arr an array of numbers
         * @return the index in the array in with the largest number (in value).
         *
         */
        public static int maxIndex(String[] arr) {

            int max = Integer.MIN_VALUE;
            int idx =-1;
            for (int i = 0; i < arr.length; i++) {
                int val =number2Int(arr[i]);
                if (val>max) {
                    max=val;
                    idx = i;
                }
            }
            return idx;
        }
}

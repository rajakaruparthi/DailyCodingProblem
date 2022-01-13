package com.daily.coding;

/*
Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 */

public class Problem7 {

    public static void main(String[] args) {
        String input = "11111";
        char[] chars = input.toCharArray();
        decodeMessage(input);
        System.out.println(countDecoding(chars, chars.length));
    }

    private static int countDecoding(char[] chars, int l) {
        if (l == 0 || l == 1)
            return 1;

        if (chars[0] == '0')   //for base condition "01123" should return 0
            return 0;

        int count = 0;

        if (chars[l - 1] > '0') {
            System.out.println("count--->" + count);
            System.out.println("l -val " + l);
            count = countDecoding(chars, l - 1);
        }

        if (chars[l - 2] == '1' || (chars[l - 2] == '2' && chars[l - 1] < '7')) {
            System.out.println("count inside-- >" + count);
            count += countDecoding(chars, l - 2);
        }
        return count;
    }


    private static void decodeMessage(String input) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            sb.append((char) (Integer.parseInt(String.valueOf(input.charAt(i))) + 96));
        }
        System.out.println(sb.toString());
    }
}

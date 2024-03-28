package org.example;

public class Palindrome {

    int resultLength;
    int resultStart;

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String input = "abb";
        System.out.println("Input string: " + input);
        String b = p.longestPalindrome(input);
        System.out.println("Longest palindrome: " + b);
    }

    private String longestPalindrome(String input) {
        int strLength = input.length();
        if (strLength < 2) {
            return input;
        }

        for (int start=0; start<strLength; start++) {
            expandRange(input, start, start); // odd
            expandRange(input, start, start + 1); // even
        }
        return input.substring(resultStart, resultStart + resultLength);
    }

    public void expandRange(String s, int begin, int end) {
        while (begin >= 0 && end < s.length()) {
            if (s.charAt(begin) == s.charAt(end)) {
                begin--;
                end++;
            } else {
                break;
            }
        }
        System.out.println("begin : " + begin + " and end : " + end);
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
            System.out.println("resultStart: " + resultStart + " resultLength: " + resultLength);
        }
    }

}

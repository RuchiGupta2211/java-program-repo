package org.example;

public class ReverseWords {

    public static void main(String[] args) {
        String input = "knowledge center youtube";
        String[] splitInput = input.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = splitInput.length-1; i>=0; i--) {
            sb.append(splitInput[i]).append(" ");
        }
        System.out.println("Reverse words are: " + sb.toString().trim());
    }
}

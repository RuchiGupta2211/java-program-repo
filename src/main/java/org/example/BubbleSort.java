package org.example;

public class BubbleSort {

    public static void main(String[] args) {
        int[] x = {3,5,1,2};

        for (int i=0; i<x.length; i++) { // O(n^2), O(1)
            for (int j=0; j<x.length - i - 1; j++) {
                if (x[j] > x[j+1]) {
                   int temp = x[j];
                   x[j] = x[j+1];
                   x[j+1] = temp;
                }
            }
        }
    }
}

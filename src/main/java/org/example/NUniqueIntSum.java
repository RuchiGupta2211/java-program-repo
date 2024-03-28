package org.example;

import java.util.Arrays;

public class NUniqueIntSum {

    public static void main(String[] args) {
        NUniqueIntSum obj = new NUniqueIntSum();
        int[] result = obj.sumZero(5);
        System.out.println("Array is : " + Arrays.toString(result));
    }

    public int[] sumZero(int n) {
        int[] array = new int[n];
        int j = 0;

        for ( int i = 1; i <= n/2 ; i++) {
            array[j] = -i;
            array[j + 1] = i;
            j = j + 2;
        }
        return array;
    }

}

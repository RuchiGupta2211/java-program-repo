package org.example;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] array = new int[] {2,4,5,1,3};
        ms.divideArray(array, 0, array.length-1);
    }
    void divideArray(int[] nums, int l, int r) {
       if(l < r) {
           int mid = l + (r-l)/2;
           divideArray(nums, l, mid);
           divideArray(nums, mid+1, r);
           mergeSort(nums, l, mid, r);
       }
    }
    private void mergeSort(int[] a, int l, int mid, int r) {
       int i = l;
       int j = mid + 1;
       int k = l;

       int[] b = new int[a.length];
       while (i <= mid && j <= r) {
           if (a[i] < a[j]) {
               b[k++] = a[i++];
           } else {
               b[k++] = a[j++];
           }
       }
       if (i > mid) {
           while (j<=r) {
               b[k++] = a[j++];
           }
       } else {
           while (i <= mid) {
               b[k++] = a[i++];
           }
       }
        System.out.println(Arrays.toString(b));
    }

}

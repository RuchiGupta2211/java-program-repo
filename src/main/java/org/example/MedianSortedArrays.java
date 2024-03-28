package org.example;

import java.util.Arrays;

public class MedianSortedArrays {
    public static void main(String[] args) {
        MedianSortedArrays obj = new MedianSortedArrays();
        double median = obj.findMedianSortedArrays(new int[]{1,3}, new int[]{2});
        System.out.println(median);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] mergedArray = new int[n+m];
        int k = 0;

        for (int i = 0; i< n; i++) {
            mergedArray[k++] = nums1[i];
        }
        for (int i = 0; i< m; i++) {
            mergedArray[k++] = nums2[i];
        }
        Arrays.sort(mergedArray);
        boolean even = mergedArray.length % 2 == 0;
        double median = even ?  mergedArray[(mergedArray.length/2)] + mergedArray[(mergedArray.length/2)-1] : mergedArray[(mergedArray.length/2)];
       return median;
    }
}

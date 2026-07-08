package InterCodes;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge the two arrays
        int[] merged = mergeArrays(nums1, nums2);
        System.out.println(Arrays.toString(merged));
        
        // Find the median
        int len = merged.length;
        if (len % 2 == 0) {
            return (merged[len / 2 - 1] + merged[len / 2]) / 2; // 
        } else {
            return merged[len / 2];//1
        }
    }

    private int[] mergeArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge the arrays
        while (i < m && j < n) 
        {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++]; 
            } 
            else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy remaining elements
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
    	MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums1, nums2)); // Output: 2.0
    }
}


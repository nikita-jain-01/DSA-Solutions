// https://leetcode.com/problems/merge-sorted-array/

// Video Lecture - https://www.youtube.com/watch?v=n7uwj04E0I4

import static java.util.Arrays.sort;

public class Merge2SortedArrayWithoutExtraSpace {

    //BRUTE FORCE SOLUTION -
    // TC - O(M+N), SC - O(M+N)
    public void bruteMerge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int i = 0, j = 0, index = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums3[index++] = nums1[i];
                i++;
            } else {
                nums3[index++] = nums2[j];
                j++;
            }
        }
        while (i < m) {
            nums3[index++] = nums1[i++];
        }
        while (j < n) {
            nums3[index++] = nums2[j++];
        }
        for (int x = 0; x < m + n; x++) {
            nums1[x] = nums3[x];
        }
    }

    // BETTER SOLUTION
    // TC - O(Min(m,n) + m log m + n log n), SC - O(1)
    public void betterMerge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = 0;
        while (i >= 0 && j < n) {
            if (nums1[i] > nums2[j]) {
//                 swap(nums1[i], nums2[j]); // uncomment it, it has use(error was coming that's why commented)
            } else {
                break;
            }
        }
        sort(nums1);
        sort(nums2);
    }

    // OPTIMAL SOLUTION
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int last = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[last] = nums1[i];
                i--;
                last--;
            } else {
                nums1[last] = nums2[j];
                j--;
                last--;
            }
        }
    }
}

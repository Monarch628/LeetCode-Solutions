class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        // Index of the median
        int mI = ((l1 + l2 - 1) / 2) + 2;
        // new sorted array
        int[] n = new int[mI];
        // pointer for nums1
        int p1 = 0;
        // pointer for nums2
        int p2 = 0;
        // pointer for array a
        int p3 = 0;

        while(p3 < mI && p1 < l1 && p2 < l2) {
            if(nums1[p1] <= nums2[p2]) {
                n[p3] = nums1[p1];
                p1++;
                p3++;
            }
            else {
                n[p3] = nums2[p2];
                p2++;
                p3++;
            }
        }

        while(p3 < mI && p1 < l1) {
            n[p3] = nums1[p1];
            p1++;
            p3++;
        }
        while (p3 < mI && p2 < l2) {
            n[p3] = nums2[p2];
            p2++;
            p3++;
        }

        return ((l1 + l2) % 2 == 1) ? n[mI - 2] : (float)(n[mI - 2] + n[mI - 1]) / 2;
    }
}
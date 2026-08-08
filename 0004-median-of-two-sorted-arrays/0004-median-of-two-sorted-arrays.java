class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
      
        int[] merged = new int[m + n];
        
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        
        for (int j = 0; j < n; j++) {
            merged[m + j] = nums2[j];
        }
        
       
        Arrays.sort(merged);
        
        int total = m + n;
        
       
        if (total % 2 == 1) {
           
            return merged[total / 2];
        } else {
            
            return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        }
    }
}


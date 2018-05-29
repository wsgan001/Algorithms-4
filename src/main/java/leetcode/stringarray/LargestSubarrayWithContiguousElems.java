package leetcode.stringarray;

/**
 * Given an array of distinct integers, find length of the longest subarray
 * which contains numbers that can be arranged in a continuous sequence.
 Examples:

 Input:  arr[] = {10, 12, 11};
 Output: Length of the longest contiguous subarray is 3

 Input:  arr[] = {14, 12, 11, 20};
 Output: Length of the longest contiguous subarray is 2

 Input:  arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
 Output: Length of the longest contiguous subarray is 5

 The important thing to note in question is, it is given that all elements are
 distinct. If all elements are distinct, then a subarray has contiguous elements
 if and only if the difference between maximum and minimum elements in subarray
 is equal to the difference between last and first indexes of subarray. So the
 idea is to keep track of minimum and maximum element in every subarray.
 */
public class LargestSubarrayWithContiguousElems {
    // Returns length of the longest contiguous subarray
    int findLength(int arr[], int n) {
        int max_len = 1;  // Initialize result
        for (int i = 0; i < n - 1; i++) {
            // Initialize min and max for all subarrays starting with i
            int mn = arr[i], mx = arr[i];

            // Consider all subarrays starting with i and ending with j
            for (int j = i + 1; j < n; j++) {
                // Update min and max in this subarray if needed
                mn = Math.min(mn, arr[j]);
                mx = Math.max(mx, arr[j]);

                // If current subarray has all contiguous elements
                if ((mx - mn) == j - i)
                    max_len = Math.max(max_len, mx - mn + 1);
            }
        }
        return max_len;  // Return result
    }
}

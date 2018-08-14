package leetcode.stringarray;

/**
 * Given an array of size n, find the majority element. The majority element is the element that
 * appears more than ⌊ n/2 ⌋ times. (assume that the array is non-empty and the majority element
 * always exist in the array.)
 */
public class MajorityElement {
    // All the other element will eventually reach count == 0
    public int majorityElement(int[] nums) {
        int result = 0, count = 0;

        for(int i = 0; i<nums.length; i++ ) {
            if(count == 0){
                result = nums[ i ];
                count = 1;
            }else if(result == nums[i]){
                count++;
            }else{
                count--;
            }
        }

        return result;
    }
}

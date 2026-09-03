class Solution {
    public boolean uniformArray(int[] nums1) {
        
        // Required variable to store input midway in the function
        int[] ravolqedin = nums1.clone();

        int min = Integer.MAX_VALUE;

        // Find minimum element
        for (int num : nums1) {
            min = Math.min(min, num);
        }

        // If minimum is odd, all elements can be made odd
        if (min % 2 != 0) {
            return true;
        }

        // If minimum is even, all elements must already be even
        for (int num : nums1) {
            if (num % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
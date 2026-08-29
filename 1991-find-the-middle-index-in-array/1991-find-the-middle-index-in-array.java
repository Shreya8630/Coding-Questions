class Solution {
    public int findMiddleIndex(int[] nums) {
        int rightSum = 0;

        // Calculate total sum
        for (int num : nums) {
            rightSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            // Remove current element from right side
            rightSum -= nums[i];

            // Check if left sum == right sum
            if (leftSum == rightSum) {
                return i;
            }

            // Add current element to left side
            leftSum += nums[i];
        }

        return -1;
    }
}

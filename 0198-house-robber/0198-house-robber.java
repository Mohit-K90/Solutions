class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        int curr = nums[0];
        int backburner = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int one = i + 1;

            int temp = curr;
            curr = Math.max(curr, backburner + nums[one]);
            backburner = temp;
        }

        return curr;
    }
}
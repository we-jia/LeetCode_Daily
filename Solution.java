class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            nums[Math.abs(nums[i]) - 1] *= -1;
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                result[0] = Math.abs(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0 && i + 1 != result[0]) {
                result[1] = i + 1;
            }
        }

        return result;
    }
}

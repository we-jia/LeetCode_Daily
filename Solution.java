class Solution {
    public int singleNumber(int[] nums) {
        int i = nums[0];
        for (int j = 1; j < nums.length; ++j) {
            i ^= nums[j];
        }
        return i;
    }
}

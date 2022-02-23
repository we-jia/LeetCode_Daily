class Solution {
    public int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {
            length += nums[i];
        }

        int[] result = new int[length];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 1; j <= nums[i]; ++j) {
                result[index] = nums[i + 1];
                index++;
            }
        }

        return result;
    }
}

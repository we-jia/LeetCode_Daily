class Solution {
    public int removeDuplicates(int[] nums) {
        int repeatedCount = 0;
        int currentNum = nums[0];

        int placedIndex = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != currentNum) {
                repeatedCount = 0;
                currentNum = nums[i];
            }

            repeatedCount++;
            if (repeatedCount > 2) {
                continue;
            }

            nums[placedIndex] = nums[i];
            placedIndex++;
        }

        return placedIndex;
    }
}

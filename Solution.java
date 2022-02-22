class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int firstPositiveIndex = nums.length;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                firstPositiveIndex = i;
                break;
            }
        }
        int firstNegativeIndex = firstPositiveIndex - 1;

        int index = 0;
        while (firstNegativeIndex != -1 || firstPositiveIndex != nums.length) {
            if (firstNegativeIndex == -1) {
                result[index] = nums[firstPositiveIndex] * nums[firstPositiveIndex];
                firstPositiveIndex++;
            } else if (firstPositiveIndex == nums.length) {
                result[index] = nums[firstNegativeIndex] * nums[firstNegativeIndex];
                firstNegativeIndex--;
            } else if (Math.abs(nums[firstNegativeIndex]) > nums[firstPositiveIndex]) {
                result[index] = nums[firstPositiveIndex] * nums[firstPositiveIndex];
                firstPositiveIndex++;
            } else {
                result[index] = nums[firstNegativeIndex] * nums[firstNegativeIndex];
                firstNegativeIndex--;
            }
            index++;
        }
        return result;
    }
}

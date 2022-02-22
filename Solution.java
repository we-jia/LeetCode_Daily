class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = 0;
        int i = Integer.MIN_VALUE;
        int result = 0;

        for (int j : nums) {
            if (j > i) {
                sum += j;
                result = Math.max(sum, result);
            } else {
                sum = j;
            }
            i = j;
        }

        return result;
    }
}

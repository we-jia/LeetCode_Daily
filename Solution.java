class Solution {
    public int maxProduct(int[] nums) {
        int min = 1;
        int max = 1;

        int result = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < 0) {
                int tmp = min;
                min = max;
                max = tmp;
            }

            min = Math.min(i * min, i);
            max = Math.max(i * max, i);

            result = Math.max(max, result);
        }

        return result;
    }
}

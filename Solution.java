class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int result = 0;

        for (int i : nums) {
            if (count == 0) {
                result = i;
            }
            count += result == i ? 1 : -1;
        }

        return result;
    }
}

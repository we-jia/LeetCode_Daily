class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int height = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                height++;
            } else {
                height--;
            }

            if (map.containsKey(height)) {
                maxLength = Math.max(maxLength, i - map.get(height));
            } else {
                map.put(height, i);
            }
        }

        return maxLength;
    }
}

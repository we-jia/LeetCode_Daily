class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : nums1) {
            for (int k : nums2) {
                int sum = j + k;
                if (!map.containsKey(sum)) {
                    map.put(sum, 1);
                } else {
                    map.put(sum, map.get(sum) + 1);
                }
            }
        }

        int count = 0;
        for (int j : nums3) {
            for (int k : nums4) {
                int sum = j + k;
                if (map.containsKey(-sum)) {
                    count += map.get(sum);
                }
            }
        }

        return count;
    }
}

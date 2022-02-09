class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.containsKey(i));
        }

        int count = 0;
        if(k != 0){
            for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        } else {
            for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
                if (Boolean.TRUE.equals(entry.getValue())) {
                    count++;
                }
            }
        }


        return count;
    }
}

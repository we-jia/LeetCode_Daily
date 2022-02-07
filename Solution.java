class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int currentSum = 0;
            for (int i : account) {
                currentSum += i;
            }
            max = Math.max(max, currentSum);
        }
        return max;
    }
}

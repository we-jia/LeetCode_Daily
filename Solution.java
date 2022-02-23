class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = lowLimit; i <= highLimit; ++i) {
            int result = this.getSum(i);
            map.put(result, map.getOrDefault(result, 0) + 1);
            max = Math.max(max, map.get(result));
        }
        return max;
    }

    private int getSum(int val) {
        int sum = 0;
        while (val > 0) {
            sum += val % 10;
            val /= 10;
        }
        return sum;
    }
}

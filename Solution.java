class Solution {
    public int countTriples(int n) {
        int max = n * n;
        int count = 0;
        for (int i = 1; i < n; ++i) {
            for (int j = i + 1; j <= n; j++) {
                int val = i * i + j * j;
                if (val > max) {
                    continue;
                }
                int sqrt = (int) Math.sqrt(val);
                if (sqrt * sqrt == val) {
                    count += 2;
                }
            }
        }
        return count;
    }
}

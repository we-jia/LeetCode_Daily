class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }

        int i = 1;
        for (int j = 1; j <= k; ++j) {
            if (i % k == 0) {
                return j;
            }
            i = (i % k) * 10 + 1;
        }

        return -1;
    }
}

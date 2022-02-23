class Solution {
    private int[] dpArr;

    public int numTrees(int n) {
        this.dpArr = new int[n + 1];
        this.dpArr[0] = 1;
        this.dpArr[1] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 0; j < i; ++j) {
                this.dpArr[i] += this.dpArr[i - 1 - j] * this.dpArr[j];
            }
        }
        return this.dpArr[n];
    }
}
